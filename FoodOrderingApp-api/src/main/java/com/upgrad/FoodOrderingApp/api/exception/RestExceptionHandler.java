package com.upgrad.FoodOrderingApp.api.exception;

import com.upgrad.FoodOrderingApp.api.model.ErrorResponse;
import com.upgrad.FoodOrderingApp.service.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * This class contains all the Exception Handlers for all the exceptions implemented in the project
 */
@ControllerAdvice
public class RestExceptionHandler {

    /**
     * Exception handler for CategoryNotFoundException
     *
     * @param exe CategoryNotFoundException type object containing error code and error message
     * @param request The web request object gives access to all the request parameters
     *
     * @return ResponseEntity<ErrorResponse> type object displaying error code and error message along with HttpStatus NOT_FOUND
     */
    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ErrorResponse> categoryNotFoundException(CategoryNotFoundException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.NOT_FOUND
        );
    }
	
	  /**
     * Exception handler for RestaurantNotFoundException
     *
     * @param exe RestaurantNotFoundException type object containing error code and error message
     * @param request The web request object gives access to all the request parameters
     *
     * @return ResponseEntity<ErrorResponse> type object displaying error code and error message along with HttpStatus NOT_FOUND
     */

    @ExceptionHandler(RestaurantNotFoundException.class)
    public ResponseEntity<ErrorResponse> restaurantNotFoundException(RestaurantNotFoundException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.NOT_FOUND
        );
    }

	  /**
     * Exception handler for ItemNotFoundException
     *
     * @param exe ItemNotFoundException type object containing error code and error message
     * @param request The web request object gives access to all the request parameters
     *
     * @return ResponseEntity<ErrorResponse> type object displaying error code and error message along with HttpStatus NOT_FOUND
     */
    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<ErrorResponse> itemNotFoundException(ItemNotFoundException exe, WebRequest request) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()), HttpStatus.NOT_FOUND
        );
    }

}
