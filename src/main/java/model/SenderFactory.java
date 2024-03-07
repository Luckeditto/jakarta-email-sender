package model;

import impl.EmailNotReallySending;

public class SenderFactory {

	public static EmailNotReallySending createEmailSender() {
		return new EmailNotReallySending();
	}
	

}
