package com.example.apiperson.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;


   @Column(nullable = false)
   private String publicPlace;

   @Column(nullable = false)
   private String cep;

   @Column(nullable = false)
   private String number;

   @Column(nullable = false)
   private String city;

   @Column(nullable = false)
   private boolean principal;

   @ManyToOne
   @JoinColumn(nullable = false)
   private Person owner;





}
