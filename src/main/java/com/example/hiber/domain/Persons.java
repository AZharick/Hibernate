package com.example.hiber.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persons {

   @EmbeddedId
   private PersonsPKey personsPKey;

   @Column
   private String phone_number;

   @Column
   private String city_of_living;

}