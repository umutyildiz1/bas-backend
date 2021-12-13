package com.umutyildiz.Bas.core.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ErrorHandler implements ErrorController {

    @Autowired
    private ErrorAttributes errorAttributes;

    @RequestMapping("/error")
    ApiError handleError(WebRequest webRequest){
        Map<String,Object> attributes = this.errorAttributes.getErrorAttributes(webRequest,ErrorAttributeOptions.defaults()
                .including(ErrorAttributeOptions.Include.MESSAGE,ErrorAttributeOptions.Include.BINDING_ERRORS));
        String message = (String) attributes.get("message");
        String path = (String) attributes.get("path");
        int status = (Integer) attributes.get("status");
        ApiError apiError = new ApiError(status,message,path);

        if (attributes.containsKey("errors")){
            List<FieldError> fieldErrors = (List<FieldError>)attributes.get("errors");
            Map <String,String> errors = new HashMap<>();
            for (FieldError fieldError : fieldErrors){
                errors.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            apiError.setValidationErrors(errors);
        }



        return apiError;
    }

    public String getErrorPath(){
        return "/error";
    }

}
