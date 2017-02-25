package cz.mka.rest;

import cz.mka.api.AlcoholService;
import cz.mka.rest.model.Alcohol;
import cz.mka.rest.model.AlcoholType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Controller
@RequestMapping(path = "/alcohol")
public class AlcoholRest {

    @Autowired
    private AlcoholService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Set<Alcohol>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @RequestMapping(path = "/{type}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Set<Alcohol>> findAllByType(@PathVariable AlcoholType type) {
        return new ResponseEntity<>(service.findAllByType(type), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Set<Alcohol>> findAllByTitle(@RequestParam String title) {
        return new ResponseEntity<>(service.findAllByTitle(title), HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Alcohol> findById(@PathVariable long id) {
        Alcohol result = service.findOne(id);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

    //todo
    public ResponseEntity<Alcohol> save() {
//        AlcoholDTO result = service.

        return null;
    }

}
