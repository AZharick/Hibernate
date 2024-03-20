package com.example.hiber.controller;

import com.example.hiber.service.DBService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons/by-city")
public class DBByCityController {
   private DBService service;

   public DBByCityController(DBService service) {
      this.service = service;
   }

   @GetMapping
   public String getPersonsByCity(@RequestParam String city) {
      return service.getPersonsByCity(city);
   }
}
