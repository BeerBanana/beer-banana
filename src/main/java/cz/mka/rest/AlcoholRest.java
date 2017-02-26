package cz.mka.rest;

import cz.mka.api.AlcoholService;
import cz.mka.rest.model.Alcohol;
import cz.mka.rest.model.AlcoholType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;

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
    public ResponseEntity<Set<Alcohol>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    // todo find all by XXX sjednotit ??

    // find all by type
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<Alcohol>> findAllByType(@RequestParam AlcoholType type) {
        return new ResponseEntity<>(service.findAllByType(type), HttpStatus.OK);
    }

    // find all by title
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<Alcohol>> findAllByTitle(@RequestParam String title) {
        return new ResponseEntity<>(service.findAllByTitle(title), HttpStatus.OK);
    }

    // find all by volume
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<Alcohol>> findAllByVolume(@RequestParam Double volume) {
        return new ResponseEntity<>(service.findAllByVolume(volume), HttpStatus.OK);
    }

    // find all by drinker id
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<Alcohol>> findAllByVolume(@RequestParam Long drinkerId) {
        return new ResponseEntity<>(service.findAllByDrinkerId(drinkerId), HttpStatus.OK);
    }

    // find by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Alcohol> findById(@PathVariable long id) {
        Alcohol result = service.findOne(id);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

    // save new
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Alcohol> save(@RequestBody @Valid Alcohol alcohol) {
        Alcohol result = service.save(alcohol);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    // update
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Alcohol> update(@PathVariable Long id,
                                          @RequestBody @Valid Alcohol alcohol) {
        alcohol.setId(id);
        Alcohol result = service.save(alcohol);
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
