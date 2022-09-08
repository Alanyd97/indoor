package com.hidro.system.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hello")
public class HelloMundo {

        @GetMapping
        public ResponseEntity<String> getByCategory() {
            return new ResponseEntity("Hola World", HttpStatus.OK);
        }

}
