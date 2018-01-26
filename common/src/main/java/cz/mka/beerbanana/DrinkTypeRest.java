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

import cz.mka.beerbanana.domain.to.DrinkTypeDTO;
import cz.mka.beerbanana.service.DrinkTypeService;

/**
 * Created by Martin Kaspar on 24/02/2017.
 */
@Controller
@RequestMapping(path = "/drinks", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DrinkTypeRest {

    @Autowired
    private DrinkTypeService service;

    // find all
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Set<DrinkTypeDTO>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    // find by id
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<DrinkTypeDTO> findOne(@PathVariable long id) {
        DrinkTypeDTO result = service.findOne(id);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // save new
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DrinkTypeDTO> save(@RequestBody @Valid DrinkTypeDTO dto) {
        DrinkTypeDTO result = service.save(dto);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    // update
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DrinkTypeDTO> update(@PathVariable Long id,
                                               @RequestBody @Valid DrinkTypeDTO dto) {
        dto.setId(id);
        DrinkTypeDTO result = service.save(dto);
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
