package com.example.hiber.repository;

import com.example.hiber.domain.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DBLinkRepository {

   @PersistenceContext
   private EntityManager entityManager;

   public DBLinkRepository() {
   }

   public String getPersonsByCity(String city) {
      String sql = "select p from Persons p where p.city_of_living = :city";
      Query query = entityManager.createQuery(sql);
      query.setParameter("city", city);
      List<Persons> result = query.getResultList();
      return result.toString();
   }
}