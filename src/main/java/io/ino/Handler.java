package io.ino;

import io.kubeless.Event;
import io.kubeless.Context;

import org.leadpony.justify.api.JsonValidationService;

public class Handler {
        public String sayHello(io.kubeless.Event event, io.kubeless.Context context) {
            System.out.println(event.toString());
            JsonValidationService service = JsonValidationService.newInstance();
            return "Hello world! AFDFCH";
        }
    }