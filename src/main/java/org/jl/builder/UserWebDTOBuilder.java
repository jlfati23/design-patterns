package org.jl.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;


    public UserWebDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    public UserWebDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    public UserWebDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    public UserWebDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + " " + address.getCity() + " " + address.getStreet();
        return this;
    }

    public UserWebDTO build() {
        this.dto = new UserWebDTO(firstName + " " + lastName, age, address);
        return dto;
    }

    public UserWebDTO getUserDTO() {
        return this.dto;
    }
}
