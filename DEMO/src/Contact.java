import java.time.LocalTime;

public class Contact {
	private String name;
	private String mobileNumber;
	private String emailAddress;
	private static String COUNTRY="india";	// capital static member
	public Contact() {
		
	}
	public Contact(String name, String mobileNumber, String emailAddress) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	

}
