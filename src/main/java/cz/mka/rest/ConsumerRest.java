package cz.mka.rest;

import cz.mka.api.ConsumerService;
import cz.mka.rest.model.ConsumerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Set;

/**
 * Created by martin on 5.3.2017.
 */
@Controller
@RequestMapping(path = "/consumers", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ConsumerRest {

    @Autowired
    private ConsumerService service;

    // find all
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<ConsumerDTO>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    // find by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ConsumerDTO> findById(@PathVariable long id) {
        ConsumerDTO result = service.findOne(id);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // save new
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ConsumerDTO> save(@RequestBody @Valid ConsumerDTO dto) {
        ConsumerDTO result = service.save(dto);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    // update
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ConsumerDTO> update(@PathVariable Long id,
                                               @RequestBody @Valid ConsumerDTO dto) {
        dto.setId(id);
        ConsumerDTO result = service.save(dto);
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
