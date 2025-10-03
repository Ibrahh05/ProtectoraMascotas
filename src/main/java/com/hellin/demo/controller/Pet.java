package com.hellin.demo.controller;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {

    /** 
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /** 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    private String name;
    /** 
     * @return LocalDate
     */
    public LocalDate getBorn() {
        return born;
    }

    /** 
     * @param born
     */
    public void setBorn(LocalDate born) {
        this.born = born;
    }

    private LocalDate born;
    /** 
     * @return String
     */
    public String getChip() {
        return chip;
    }

    /** 
     * @param chip
     */
    public void setChip(String chip) {
        this.chip = chip;
    }

    private String chip;
    private String category;
    /** 
     * @return String
     */
    public String getCategory() {
        return category;
    }

    /** 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *@return boolean
     */

    public Boolean getAdopt() {
        return adopt;
    }
    /**
     *@param adopt
     */
    public void setAdopt(Boolean adopt) {
        this.adopt = adopt;
    }
    private boolean adopt;
}
