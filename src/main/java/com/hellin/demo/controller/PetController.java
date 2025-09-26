package com.hellin.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellin.demo.entity.PetRepository;

@RestController
public class PetController {
    
   private PetRepository petRepository;

   /**
    * Este método duevuelve el listado de pets
    * @return List<Pet> información de cada asignatura
    */

    @GetMapping("/hello")
    public String saludo () {
        return "Hola mundo";
    }
    public PetController(PetRepository petRepository){
        this.petRepository=petRepository;
    }
    @GetMapping("/listado")
    public List<Pet> hello(){
        List<Pet> listPets = petRepository.findAll();

        return listPets;
    }
}
