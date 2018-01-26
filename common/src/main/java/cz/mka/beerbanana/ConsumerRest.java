package cz.mka.beerbanana;

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

import java.time.LocalDateTime;
import java.util.Set;

import javax.validation.Valid;

import cz.mka.beerbanana.domain.enums.ConsumerStatus;
import cz.mka.beerbanana.domain.to.ConsumerTO;
import cz.mka.beerbanana.service.ConsumerService;

@Controller
@RequestMapping(path = "/consumers", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ConsumerRest {

    @Autowired
    private ConsumerService service;

    // find all
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<ConsumerTO>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    // find by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ConsumerTO> findOne(@PathVariable long id) {
        ConsumerTO result = service.findOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // find by id todo tohle asi neni uplne oka
    @RequestMapping(path = "/find", method = RequestMethod.GET)
    public ResponseEntity<ConsumerTO> findByEmail(@RequestParam String email) {
        ConsumerTO result = service.findByEmail(email);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // save new
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ConsumerTO> save(@RequestBody @Valid ConsumerTO dto) {

        dto.setStatus(ConsumerStatus.SOBER);
        dto.setDateRegistration(LocalDateTime.now());

        ConsumerTO result = service.save(dto);

        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    // update
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ConsumerTO> update(@PathVariable Long id,
                                             @RequestBody @Valid ConsumerTO dto) {
        dto.setId(id);

        ConsumerTO result = service.save(dto);

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
