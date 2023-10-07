import java.util.Scanner; // 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

    public class Contact implements Comparable<String>{
	
	private String name;
	private String phoneNumber;
	private String email;
	private String address;     // Contact informations
	private String birthday;
	private String notes;
	
	public Contact() {  // Default Constracutor
	}
	public Contact(String name, String phoneNumber, String email, String address, String birthday, String notes) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;               // Constracutor
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
	}
	public Contact(Contact c) {
		this.name = c.name;
		this.phoneNumber = c.phoneNumber;
		this.email = c.email;         // Copy Constracutor
		this.address = c.address;
		this.birthday = c.birthday;
		this.notes = c.notes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String adress) {
		this.address = adress;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void displayContact() {
		 
		System.out.println("Contact's phone number: "+phoneNumber);
		System.out.println("Contact's name: "+name);
		System.out.println("Contact's email: "+email);             // This method display all contact's informations. 
		System.out.println("Contact's address: "+address);
		System.out.println("Contact's birthday: "+birthday);
		System.out.println("Contact's notes: "+notes);
	}
	@Override                             //## CompareTo method will return >> :: (name > cName) -> = +Positive , if (name < cName) ->  = -Negative , (name=cName) -> = 0 
	public int compareTo(String cName) {  //## We will use this method in Sorting to know which Object must be First 
			return this.name.toUpperCase().compareTo(cName.toUpperCase()); //## This method Will 
			                                   //## For Example "a".compareTo("z"); --> Will return -25 since z is greater than a in the decimal value
	}
	
	public void readContact() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Contact's phone number: "+name);
		phoneNumber = input.nextLine();
		
		System.out.println("Enter the Contact's name: "+phoneNumber);
		name = input.nextLine();
		
		System.out.println("Enter the Contact's email: "+email);  // read Contact informations
		email = input.nextLine();
		
		System.out.println("Enter the Contact's address: "+address);
		address = input.nextLine();
		
		System.out.println("Enter the Contact's birthday: "+birthday);
		birthday = input.nextLine();
		
		System.out.println("Enter the Contact's notes: "+notes);
		notes = input.nextLine();
	}
	
	
	
	
	
	
	
	
	
	
	// Testing 
	public static void main(String args[] ) {
		Contact c1 = new Contact("A","0564712006","Azizswe.ksu@gmail.com","Riyadh,alkhuzama","14,05,2003","friend from work");
		Contact c2 = new Contact("AAZZZZaA","055345342","khaled.ksu@gmail.com","jeddah,rafha","14,05,1966","friend from my brother");
		Contact c3 = new Contact("nawaf","0564712006","nawaf.ksu@gmail.com","makkah,asser","14,05,2001","friend from work");
            System.out.println(c1.compareTo("z"));
	}
}