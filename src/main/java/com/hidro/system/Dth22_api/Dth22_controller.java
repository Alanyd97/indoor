package com.hidro.system.Dth22_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Dth22_controller {

        @GetMapping
        public ResponseEntity<Dth22_response> getDataById() {
            return new ResponseEntity(new Dth22_response(), HttpStatus.OK);
        }

        @PostMapping("save")
        public ResponseEntity<Dth22_response> saveData(@RequestBody Dth22_request dth22_request) {
            //TODO guardar los datos que el modulo wifi mande
            return new ResponseEntity(new Dth22_response(), HttpStatus.OK);
        }

}
