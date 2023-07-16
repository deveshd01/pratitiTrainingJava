
public class PhoneBook {
	
	private String pName="devesh";
	private Contact[] contacts;
	
	public int index=0;
	
	public PhoneBook() {
//		this.pName="default PhoneBook";
//		this.contacts = new Contact[50];
	this("default PhoneBook", 50);
	}
	// constructor
	
	public PhoneBook(String Name, int size) {
		super();
		this.pName = Name;
//		pName = Name;		// we can ignore this keyword
		this.contacts = new Contact[size];
	}
	
	public void add(String name, String mobileNumber, String email) {
		Contact c = new Contact(name, mobileNumber, email);
//		contacts[index++]=c;
		add(c);
	}
	public void add(Contact c) {
		contacts[index++]=c;
	}
	
	public void display() {
		System.out.println("Welcome to Phone book : "+pName );
		for(int i=0;i<index;i++) {
			Contact c=contacts[i];
			System.out.println(c.getName() + " , " + c.getMobileNumber() + " , " + c.getEmailAddress());
		}
	}
	
	public Contact search(String name) {
		for(int i=0;i<index;i++) {
			if(contacts[i].getName()==name)return contacts[i];
		}
		return null;
	}
	
	public void updateMobile(String name, String newNumber) {
		Contact c = search(name);
		if(c!=null) {
			c.setMobileNumber(newNumber);
			System.out.println("Number Updated Successfully");
		}
		else System.out.println("Name not found");
		
	}
}
