import java.util.Scanner;
public class Phonebook {

	public static void main(String[] args) {
		

	LinkedList<Contact> Contacts = new LinkedList<Contact>(); // All Contacts 
	LinkedList<Event> Events = new LinkedList<Event>(); // All 
	Event e1 = new Event("Lancuh w", "1/1/2022","12:00","Riyadh");
	Event e2 = new Event("Lancuh f", "1/1/2022","12:00","Riyadh");
	Event e3 = new Event("Lancuh f", "1/1/2022","12:00","Riyadh");
	Event e4 = new Event("Lancuh f", "1/1/2022","12:00","Riyadh");


	Scanner input = new Scanner(System.in);
	
		int choice = 0;
	
		System.out.println("Welcome to the Linked Tree Phonebook!"); // Menu for choosing .
	
		do {	
			System.out.println("Please choose an option: ");
			System.out.println("1. Add a contact ");
			System.out.println("2. Search for a contact ");
			System.out.println("3. Delete a contact ");
			System.out.println("4. Schedule an event ");
			System.out.println("5. Print event details ");
			System.out.println("6. Print contacts by first name ");
			System.out.println("7. Print all events alphabetically ");
			System.out.println("8. Print all Contacts in Phonebook");
			System.out.println("9. Exit");
			System.out.println();
			System.out.print("Enter your Choice: ");
			
			 
	               
	         choice = input.nextInt();
	         input.nextLine(); 
	                    
			switch(choice) {
		
			case 1:
				
				Scanner add = new Scanner(System.in);
				System.out.print("Enter the contact's name: ");
				String newName = add.nextLine();
				System.out.print("Enter the contact's phone number: ");
				String newPhone = add.nextLine();
				System.out.print("Enter the contact's email address: ");
				String newEmail = add.nextLine();
				System.out.print("Enter the contact's address: ");
				String newAddress = add.nextLine();
				System.out.print("Enter the contact's birthday: ");
				String newBirthday = add.nextLine();
				System.out.print("Enter any notes for the contact: ");
				String newNotes = add.nextLine();
				System.out.println();
				System.out.println();
				
				Contact c = new Contact(newName, newPhone, newEmail, newAddress, newBirthday, newNotes);
				
				Contacts.addContact(c);
				
				break;
			
			case 2: 
				System.out.println("Enter search criteria:");
				System.out.println("1. Name");
				System.out.println("2. Phone Number");
				System.out.println("3. Email Address");
				System.out.println("4. Address");
				System.out.println("5. Birthday");
				System.out.println();
            
				Scanner searchCritrea = new Scanner(System.in);
				int searchChoice = 0;
				
				
				    System.out.print("Enter your choice: ");
				   
				        searchChoice = input.nextInt();
				        input.nextLine(); 
				        
				    
				
				switch(searchChoice){
          
				case 1:
            	
					System.out.println("Enter the contact's Name:");
					String name = searchCritrea.nextLine();
					Contacts.SearchByName(name);  
          	  
					break;
            
				case 2:
					System.out.println("Enter the contact's Phonenumber:");
					String phone = searchCritrea.nextLine();
					Contacts.SearchByPhoneNumber(phone);  
                	  
					break;
            
				case 3:
					System.out.println("Enter the contact's Email Address:");
					String email = searchCritrea.nextLine();
					Contacts.SearchByEmail(email);
            
					break;
            
				case 4:
					System.out.println("Enter the contact's Address:");
					String address = searchCritrea.nextLine();
					Contacts.SearchByAddress(address);
            
					break;
            
            
				case 5:
					System.out.println("Enter the contact's Birthday:");
					String birthday = searchCritrea.nextLine();
					Contacts.SearchByAddress(birthday);
         
					break;
            
				}
				break;
			
			
			case 3: 
				Scanner delete = new Scanner(System.in);
				Scanner deleteContact = new Scanner(System.in);
				
				System.out.println("Enter delete criteria:");
				System.out.println("1. Delete by name");
				System.out.println("2. Delete by phone number");
				System.out.println();
				
				int deleteChoice = 0;
				
				    System.out.print("Enter your choice: ");
				        deleteChoice = delete.nextInt();
				        delete.nextLine(); // Consume the newline character

				     
				
				
				switch(deleteChoice) {
				
				case 1:
					System.out.print("Enter Name of contact: ");
					String deleteByName = deleteContact.nextLine();
					Contacts.deleteContactByName(deleteByName);
					//Contacts.deleteContactByName(deleteByName);
					break;
			
				case 2:
					System.out.print("Enter Phone number of contact: ");
					String deleteByPhone = deleteContact.nextLine();
					Contacts.deleteContactByPhoneNumber(deleteByPhone);
					break;
				}
			
				break;
			
			
			case 4:
				Scanner read = new Scanner(System.in);
				System.out.println("Enter Event Title");
				String nTitle = read.nextLine();
				System.out.println("Enter Contact name");
				String nContactName = read.nextLine();
				System.out.println("Enter  date of event");
				String nDate = read.nextLine();
				System.out.println("Enter the time");
				String nTime = read.nextLine();
				System.out.println("Enter Location");
				String nLocation = read.nextLine();
				
				Event e = new Event(nTitle,nDate,nTime,nLocation);
				Contact c1 = Contacts.SearchByName(nContactName);
				if(c1 == null)
					System.out.println("Sorry Contact doesn't exist");
				if(c1 != null ) {
					e.setContact(c1);
					c1.getEvents().addEvent(e);
					Events.addEvent(e);
					
					
					System.out.println("Event has been Schedule succssfully!");
				}
				
				break;
			
			case 5: 
			
				Scanner readInfo = new Scanner(System.in);
				Scanner readInfo2 = new Scanner(System.in);

				System.out.println("Enter search criteria");
				System.out.println("1. Contact name");
				System.out.println("2. Event title");
				System.out.println();
				
				    System.out.print("Enter your choice: ");
				    
				        int eventSearchChoice = readInfo.nextInt();
				                                                                       // Consume the newline character
				        switch (eventSearchChoice) {
						case 1:
					        System.out.print("Enter the contact's name: ");
					        String contactName = readInfo2.nextLine();
					        Contacts.printEventsByContactName(contactName);
					        break;
					    case 2:
					        System.out.print("Enter the event title: ");
					        String eventTitle = readInfo2.nextLine();
					        Events.printEventsByTitle(eventTitle);
					        break;
						
						
				       
						default:
				           System.out.println("Invalid choice. Please enter 1 or 2.");
				           break;
				        }

				                                                                    // Exit the loop if the choice is valid
				         
				        
				        
				    
				

				
				
			
			
			case 6: 
				
				break;
			
			case 7: 
				
				if(Events.isEmpty())
					System.out.println("There is No Events");
				Events.displayAllEventsInformation();
				break;
				
				
			case 8:
				
				Contacts.displayAllContactsInformation();
				break;
				
			case 9: 
				System.out.println();
				System.out.println("Goodbye!");
				break;	
			}
	
		}while(choice >= 1 && choice < 9); 

	}
		
}


		
	
 

	