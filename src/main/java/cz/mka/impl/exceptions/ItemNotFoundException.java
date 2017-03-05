package cz.mka.impl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by martin on 5.3.2017.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Item not found!")  // 404
public class ItemNotFoundException extends RuntimeException {

}
