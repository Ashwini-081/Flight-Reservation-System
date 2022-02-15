package Ashwini.Engineer.demoApplicationFlight.controller;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorPagesController implements ErrorController {
    @RequestMapping(value="/error")
    public String errorHandler(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {

            int statusCode = Integer.valueOf(status.toString());
            System.out.println(statusCode);

            if (statusCode == HttpStatus.BAD_REQUEST.value()) {
                return "errors/400-error";
            }

            if (statusCode == HttpStatus.FORBIDDEN.value()) {
                return "errors/403-error";
            }

            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                return "errors/404-error";
            }

            if (statusCode == HttpStatus.REQUEST_TIMEOUT.value()) {
                return "errors/408-error";
            }

            if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return "errors/500-error";
            }

            if (statusCode == HttpStatus.BAD_GATEWAY.value()) {
                return "errors/502-error";
            }

            if (statusCode == HttpStatus.SERVICE_UNAVAILABLE.value()) {
                return "errors/503-error";
            }

            if (statusCode == HttpStatus.GATEWAY_TIMEOUT.value()) {
                return "errors/504-error";
            }
        }

        return "errors/general-error-page";
    }


    public String getErrorPath() {
        return "/error";
    }
}
