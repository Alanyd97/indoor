package com.hidro.system.Dth22_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Dth22_controller {

        @GetMapping
        public ResponseEntity<Dth22_response> getByCategory() {
            return new ResponseEntity(new Dth22_response(), HttpStatus.OK);
        }

}
