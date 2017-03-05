package cz.mka.rest;

import cz.mka.api.ConsumerService;
import cz.mka.rest.model.ConsumerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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







}
