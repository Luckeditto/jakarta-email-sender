package impl;

import domain.Email;

public class EmailNotReallySending implements IEmailSender {
	
	
	public EmailNotReallySending() {	
	}

	@Override
	public void sendEmail(Email email) {
		System.out.println("Email sent successfully to " + email.getAdress());
	}

}
