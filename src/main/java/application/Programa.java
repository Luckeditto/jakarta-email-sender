package application;


import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import domain.Email;
import impl.EmailSender;
import impl.IEmailSender;
import model.EmailFactory;
import model.SenderFactory;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Email> emails = new TreeSet<>();
		int option;
		String message = "hi, this is a test";
		String senderTest = "luckeddev@gmail.com";
 
		do {
			System.out.println("Type next the email that is going to receive the message: ");
			String emailAdress = sc.nextLine();
			Email email = EmailFactory.createEmail(emailAdress, message);
			emails.add(email);
			System.out.println(emailAdress + " has been added to the list of emails who'll receive a special message!" );
			System.out.println("type 1 to add/continue to add emails or type any other number"
					+ " to send emails already added: ");
			option = sc.nextInt();
			sc.nextLine();
			
		} while(option == 1);
		sc.close();
		
		
		
		for(Email email : emails) {
			EmailSender.sendPlainTextEmail(senderTest, email.getAdress(), "email testing", List.of("Hi", " testing the jakarta email implementation"), true);
		}
		
		
		/*IEmailSender sender = SenderFactory.createEmailSender();
		for(Email email : emails) {
			sender.sendEmail(email);
		}
		*/
		

	}

}
