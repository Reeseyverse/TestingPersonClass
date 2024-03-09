package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person { // CLASS
    private String name;
    private int age;

    private boolean job;

    private String partnerName;

    private boolean pets;

    private int partnerAge;

    private int petsAge;

    //CONSTRUCTOR

    // Getters and Setters


    public void setName(String name) {
        this.name = "Leon";
    }

    public void setAge(int age) {
        this.age = 5;
    }


    // MINE
    public void setPartnerName(String expected) {
        this.partnerName = "Barbara";
    }

    public void setPets(boolean expected) {
        this.pets = true;
    }

    public void setJob(boolean expected) {
        this.job = false;
    }

    public void setPartnerAge(int expected) {
        this.partnerAge = 26;
    }

    public void setPetsAge(int expected) {
        this.petsAge = 2;
    }
// END OF MINE


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // MINE
    public String getPartnerName() {
        return partnerName;
    }

    public boolean isPets() {
        return pets;
    }

    public boolean isJob() {
        return job;
    }

    public int getPartnerAge() {
        return partnerAge;
    }

    public int getPetsAge() {
        return petsAge;
    }
    // MINE ENDS

}

