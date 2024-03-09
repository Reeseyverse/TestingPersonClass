package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {


    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    //MINE
    @Test
    public void testPartnerName(){
        // Given
        Person person = new Person();
        String expected = "Barbara";

        // When
        person.setPartnerName(expected);
        String actual = person.getPartnerName();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testPets(){
        Person person = new Person();
        boolean expected = true;

        person.setPets(expected);
        boolean actual = person.isPets();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testJob(){
        Person person = new Person();
        boolean expected = false;

        person.setJob(expected);
        boolean actual = person.isJob();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testPetsAge() {
        // Given
        Person person = new Person();
        Integer expected = 2;

        // When
        person.setPetsAge(expected);

        // Then
        Integer actual = person.getPetsAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testPartnersAge() {
        // Given
        Person person = new Person();
        Integer expected = 26;

        // When
        person.setPartnerAge(expected);

        // Then
        Integer actual = person.getPartnerAge();
        Assert.assertEquals(expected, actual);
    }
}

