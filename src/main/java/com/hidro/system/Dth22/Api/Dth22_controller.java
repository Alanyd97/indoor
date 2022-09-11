package com.hidro.system.Dth22.Api;

import com.hidro.system.Dth22.Data.Dth22_entity;
import com.hidro.system.Dth22.Service.Dth22_service_impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
public class Dth22_controller {
        @Autowired
        Dth22_service_impl dth22_service_impl;

        @GetMapping//TODO deberia ser response
        public ResponseEntity<List<Dth22_entity>> getDataById() {
            return new ResponseEntity(dth22_service_impl.findAll(), HttpStatus.OK);
        }
        @GetMapping("/ping")
        public ResponseEntity<String> ping() {
            return new ResponseEntity("pong", HttpStatus.OK);
        }

        //@PostMapping("save",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
        @RequestMapping(value = "/save", method = RequestMethod.POST,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
        public ResponseEntity<Dth22_response> saveData(@RequestParam Map<String,String> allParams) {
            //TODO guardar los datos que el modulo wifi mande
            return new ResponseEntity(dth22_service_impl.save(
                    new Dth22_request(
                        new Integer(allParams.get("temperature")),
                        new Integer(allParams.get("humidity")))), HttpStatus.OK);
        }

}
