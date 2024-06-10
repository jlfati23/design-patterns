package org.jl.builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		UserWeb userWeb = createUser();

		UserWebDTO dto = new UserWebDTOBuilder().withFirstName(userWeb.getFirstName()).withLastName(userWeb.getLastName())
				.withAddress(userWeb.getAddress()).withBirthday(userWeb.getBirthday())
				.build();
		System.out.println(dto.toString());

		UserWebDTO userWebDTO = UserWebDTO.UserWebDTOBuilderInside.getBuilder().withFirstName(userWeb.getFirstName()).withLastName(userWeb.getLastName()).build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static UserWeb createUser() {
		UserWeb userWeb = new UserWeb();
		userWeb.setBirthday(LocalDate.of(1960, 5, 6));
		userWeb.setFirstName("Ron");
		userWeb.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		userWeb.setAddress(address);
		return userWeb;
	}
}
