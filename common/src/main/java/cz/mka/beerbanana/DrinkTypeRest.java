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

import java.util.Set;

import javax.validation.Valid;

import cz.mka.beerbanana.domain.to.DrinkTypeTO;
import cz.mka.beerbanana.service.DrinkTypeService;

@Controller
@RequestMapping(path = "/drinks", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DrinkTypeRest {

    @Autowired
    private DrinkTypeService service;

    // find all
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<DrinkTypeTO>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    // find by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<DrinkTypeTO> findOne(@PathVariable long id) {
        DrinkTypeTO result = service.findOne(id);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // save new
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DrinkTypeTO> save(@RequestBody @Valid DrinkTypeTO dto) {
        DrinkTypeTO result = service.save(dto);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    // update
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DrinkTypeTO> update(@PathVariable Long id,
                                              @RequestBody @Valid DrinkTypeTO dto) {
        dto.setId(id);
        DrinkTypeTO result = service.save(dto);
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
