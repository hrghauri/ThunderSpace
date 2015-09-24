public class BuddyInfo {

	String name;

	String address;

	String phone_nummber;

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getAddress() {
	return address;
	}

	public void setAddress(String address) {
	this.address = address;
	}

	public String getPhone_nummber() {
	return phone_nummber;
	}

	
	public void setPhone_nummber(String phone_nummber) {
	this.phone_nummber = phone_nummber;}

	public static void main(String[] args) {

		// TODO Auto-generated method stub


		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Homer");	
		System.out.println("Hello "+buddy.getName());
	}

}