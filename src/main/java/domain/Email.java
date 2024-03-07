package domain;



public class Email implements Comparable<Email> {
	
	String adress;
	String message;
	
	public Email() {
		
	}
	
	public Email(String addr, String msg) {
		this.adress = addr;
		this.message = msg;
	}
	
	
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

	@Override
	public String toString() {
		return "Email [adress=" + adress + ", message=" + message + "]";
	}



	@Override
	public int compareTo(Email otherEmail) {
		return this.adress.compareToIgnoreCase(otherEmail.getAdress());
	}

	

	

}
