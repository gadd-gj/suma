/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.operacion.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.operacion.controller.pojo.Suma;

/**
 *
 * @author gaddiel
 */
@RestController
@RequestMapping("/suma")
public class SumaController {

    @PostMapping("/")
    public ResponseEntity<?> sumar(@RequestBody Suma suma) {

        Map<String, Double> response = new HashMap<>();
        response.put("resultado", suma.getA() + suma.getB());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
