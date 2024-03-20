package com.example.hiber.service;

import com.example.hiber.repository.DBLinkRepository;
import org.springframework.stereotype.Service;

@Service
public class DBService {
   private DBLinkRepository repository;

   public DBService(DBLinkRepository repository) {
      this.repository = repository;
   }

   public String getPersonsByCity(String city) {
      return repository.getPersonsByCity(city);
   }
}
