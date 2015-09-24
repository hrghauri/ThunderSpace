import java.util.ArrayList; 
  
  
  
 public class AddressBook{ 
 private ArrayList<BuddyInfo> AddressBook = new ArrayList<BuddyInfo>(); 
  
  
  
 public void removeBuddy(int index){ 
 AddressBook.remove(index); 
 } 
  
  
 public void addBuddy(BuddyInfo abuddy){ 
 AddressBook.add(abuddy);
 
 } 
 
 
 
 public static void main(String[] args) { 
	  
	  
	 BuddyInfo buddy= new BuddyInfo();
	 BuddyInfo buddy2 = new BuddyInfo();
	 buddy.setName("Haris");
	 buddy2.setName("Raahim");
	 AddressBook stuff= new AddressBook(); 
	 System.out.println("hello!!"); 
	  
	 stuff.addBuddy(buddy); 
	 stuff.addBuddy(buddy2);
	 //change after uploading it online
	 //another 
	 stuff.addBuddy(buddy2);
	 
	 stuff.removeBuddy(0); 
	 } 
 
 }
