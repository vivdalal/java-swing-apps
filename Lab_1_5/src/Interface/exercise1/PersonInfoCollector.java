/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.exercise1;

import Business.Address;
import Business.Person;

/**
 *
 * @author vivekdalal
 */
public class PersonInfoCollector {

    public static void main(String[] args) {
        //Creating the Person Object. We will print all the details on the console.
        PersonInfoCollector personInfoCollector = new PersonInfoCollector();

        Person person = personInfoCollector.populatePersonObj();
        personInfoCollector.displayPersonObj(person);
    }

    private Person populatePersonObj() {

        Person person = new Person();
        //Setting Person name details
        person.setFirstName("John");
        person.setLastName("Doe");

        //Setting other personal details
        person.setSsn("123123123");
        person.setDob("01/01/1991");

        //Creating 3 address Objects for Work, Home and Local address respectively
        Address workAddress = new Address();
        Address homeAddress = new Address();
        Address localAddress = new Address();

        //Setting workAddress details
        workAddress.setAddrLn1("130 Hurtig Hall");
        workAddress.setAddrLn2("2C");
        workAddress.setCity("Boston");
        workAddress.setState("MA");
        workAddress.setZipCd("02118");

        //Setting localAddress details
        localAddress.setAddrLn1("22 Saint Cyprians PL");
        localAddress.setAddrLn2("3L");
        localAddress.setCity("Boston");
        localAddress.setState("MA");
        localAddress.setZipCd("02120");

        //Setting homeAddress details
        homeAddress.setAddrLn1("704 Bhoomi Apartment");
        homeAddress.setAddrLn2("Mahavir Nagar, Kandivali West");
        homeAddress.setCity("Mumbai");
        homeAddress.setState("MH");
        homeAddress.setZipCd("400067");

        //Setting the addresses into the Person object.
        person.setWorkAddress(workAddress);
        person.setHomeAddress(homeAddress);
        person.setLocalAddress(localAddress);
        return person;
    }

    private void displayPersonObj(Person person) {

        //We will display all the fields on the console
        System.out.println("============================================================");
        System.out.println("Displaying the information collected for the Person");
        System.out.println("============================================================");
        System.out.println("Person Information: ");
        System.out.println("============================================================");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("DOB: " + person.getDob());
        System.out.println("SSN: " + person.getSsn());

        //Displaying each of the address
        System.out.println("============================================================");
        System.out.println("Work Address: ");
        System.out.println("============================================================");
        System.out.println("Address Line 1: " + person.getWorkAddress().getAddrLn1());
        System.out.println("Address Line 2: " + person.getWorkAddress().getAddrLn2());
        System.out.println("City: " + person.getWorkAddress().getCity());
        System.out.println("State: " + person.getWorkAddress().getState());
        System.out.println("Zip: " + person.getWorkAddress().getZipCd());

        System.out.println("============================================================");
        System.out.println("Home Address: ");
        System.out.println("============================================================");
        System.out.println("Address Line 1: " + person.getHomeAddress().getAddrLn1());
        System.out.println("Address Line 2: " + person.getHomeAddress().getAddrLn2());
        System.out.println("City: " + person.getHomeAddress().getCity());
        System.out.println("State: " + person.getHomeAddress().getState());
        System.out.println("Zip: " + person.getHomeAddress().getZipCd());

        System.out.println("============================================================");
        System.out.println("Local Address: ");
        System.out.println("============================================================");
        System.out.println("Address Line 1: " + person.getLocalAddress().getAddrLn1());
        System.out.println("Address Line 2: " + person.getLocalAddress().getAddrLn2());
        System.out.println("City: " + person.getLocalAddress().getCity());
        System.out.println("State: " + person.getLocalAddress().getState());
        System.out.println("Zip: " + person.getLocalAddress().getZipCd());
        System.out.println("============================================================");
        System.out.println("All person information has been successfully displayed.");
        System.out.println("============================================================");

    }

}
