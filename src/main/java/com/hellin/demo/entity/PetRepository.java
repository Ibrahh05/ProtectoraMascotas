package com.hellin.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hellin.demo.controller.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>   {
    
        

}
