package org.jl.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTO{

	private String name;
	
	private String address;
	
	private String age;

	public UserWebDTO(String name, String age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public UserWebDTO() {

	}
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}
	private void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}

	public static class UserWebDTOBuilderInside {
		private String firstName;
		private String lastName;
		private String address;
		private String age;
		private UserWebDTO dto;


		public UserWebDTOBuilderInside withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}

		public UserWebDTOBuilderInside withLastName(String lname) {
			this.lastName = lname;
			return this;
		}

		public UserWebDTOBuilderInside withBirthday(LocalDate date) {
			Period ageInYears = Period.between(date, LocalDate.now());
			this.age = Integer.toString(ageInYears.getYears());
			return this;
		}

		public UserWebDTOBuilderInside withAddress(Address address) {
			this.address = address.getHouseNumber() + " " + address.getCity() + " " + address.getStreet();
			return this;
		}

		public UserWebDTO build() {
			this.dto = new UserWebDTO();
			dto.setName(firstName + " " + lastName);
			dto.setAddress(address);
			dto.setAge(age);
			return dto;
		}

		public UserWebDTO getUserDTO() {
			return this.dto;
		}

		public static UserWebDTOBuilderInside getBuilder(){
			return new UserWebDTOBuilderInside();
		}
	}
	
}
