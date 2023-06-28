package org.example.minifamily;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickName;
    private int age;
    public int trickLevel;
    private String [] habits;


    private void eat(){
        System.out.println("I am eating!");
    }

    private void respond(){
        System.out.println("Hello owner. I am-"+this.nickName+".I miss you!");

    }
    private void foul(){
        System.out.println("I need to cover it up!");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public Pet(String species, String nickName, int age, int trickLevel, String[] habits) {//Full constructor
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public Pet() {//Empty Constructor
    }

    public Pet(String species, String nickName) {
        this.species = species;
        this.nickName = nickName;
    }

    public void setHabits(String eat, String drink, String sleep) {
    }
}
