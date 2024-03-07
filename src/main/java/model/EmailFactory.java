package model;

import domain.Email;

public class EmailFactory {

	
	public static Email createEmail(String address, String message) {
		return new Email(address, message);
	}
}
