package org.friso.calendar.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
//@RequestMapping("/calendar")
public class CalendarRestController {


    @GetMapping(path = "/home")
    public ResponseEntity<List<String>> get() {
        return ResponseEntity.ok(Arrays.asList("Hello there home!"));
    }

    @GetMapping(path = "/calendar/all")
    public ResponseEntity<List<String>> getAll() {
        return ResponseEntity.ok(Arrays.asList("Hello there!"));
    }


}
