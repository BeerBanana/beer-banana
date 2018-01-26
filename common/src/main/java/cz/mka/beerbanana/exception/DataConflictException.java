package cz.mka.beerbanana.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Item duplicity found!")  // 409
public class DataConflictException extends RuntimeException {

}
