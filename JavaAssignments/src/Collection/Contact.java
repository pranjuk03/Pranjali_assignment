package Collection;

public class Contact {
	long phoneNo;
	String name;
	String email;
	private Contact.Gender gen;
	enum Gender{
		Male,Female,Others
	}
	public Contact(long phoneNo, String name, String email ,Gender gen) {
		super();
		this.phoneNo = phoneNo;
		this.name = name;
		this.email = email;
		this.gen=gen;
	}
	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", name=" + name + ", email=" + email + ", gen=" + gen + "]";
	}
	
}


