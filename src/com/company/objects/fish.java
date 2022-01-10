package com.company.objects;

import java.time.LocalDate;

public class fish {
    private int animalID;
    private String name;
    private String species;
    private int age;
    private double weight;
    private double height;
    private String food;
    private LocalDate lastFed;

    public fish(int animalID, String name, String species, int age, double weight, double height, String food) {
        this.animalID = animalID;
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.food = food;

    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }







    @Override
    public String toString(){
        return  animalID + "," + name + "," + species + "," + age + "," + weight + "," + height + "," + food;

    }








}
