package cz.mka.rest;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cz.mka.api.AlcoholService;
import cz.mka.rest.model.AlcoholDTO;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Controller
@RequestMapping(path = "/drinks", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AlcoholRest {

    @Autowired
    private AlcoholService service;

    // find all
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<AlcoholDTO>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    // todo find all by XXX sjednotit ??


    // find all by title
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<AlcoholDTO>> findAllByTitle(@RequestParam String title) {
        return new ResponseEntity<>(service.findAllByTitle(title), HttpStatus.OK);
    }

    // find all by volume
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<AlcoholDTO>> findAllByVolume(@RequestParam Double volume) {
        return new ResponseEntity<>(service.findAllByVolume(volume), HttpStatus.OK);
    }

    // find all by drinker id
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<AlcoholDTO>> findAllByVolume(@RequestParam Long drinkerId) {
        return new ResponseEntity<>(service.findAllByDrinkerId(drinkerId), HttpStatus.OK);
    }

    // find by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AlcoholDTO> findById(@PathVariable long id) {
        AlcoholDTO result = service.findOne(id);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

    // save new
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AlcoholDTO> save(@RequestBody @Valid AlcoholDTO alcohol) {
        AlcoholDTO result = service.save(alcohol);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    // update
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AlcoholDTO> update(@PathVariable Long id,
                                          @RequestBody @Valid AlcoholDTO alcohol) {
        alcohol.setId(id);
        AlcoholDTO result = service.save(alcohol);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    // delete
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



}
