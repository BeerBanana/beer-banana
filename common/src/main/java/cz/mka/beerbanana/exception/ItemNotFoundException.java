package cz.mka.beerbanana.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Item not found!")  // 404
public class ItemNotFoundException extends RuntimeException {

}
