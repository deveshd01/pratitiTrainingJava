public class PhoneBookTest {
	public static void main(String[] args) {
		PhoneBook phBook = new PhoneBook("Friends",10);
		phBook.add("Anu", "1234567890" , "anu@0310.com");
		phBook.add("Aman", "234562676", "aman@234.com");
		
		Contact c = new Contact("Devesh", "573527557", "devesh@123.com");
		phBook.add(c);
		
		Contact c2 = phBook.search("Devesh");
		if(c2!=null) {
			System.out.println(c2.getName() + " , " + c2.getMobileNumber() + " , " + c2.getEmailAddress());
		}else {
			System.out.println("Contact Not found");
		}
		
		phBook.display();
	}
}

