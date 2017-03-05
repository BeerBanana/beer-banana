package cz.mka.impl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by martin on 5.3.2017.
 */
@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Item duplicity found!")  // 409
public class DataConflictException extends RuntimeException {

}
