package week1.day1;

public class mobile {
	
	
	public void sendMgs() { 
		String mgs = "Hi! How are You";
	System.out.println("Send mgs=" + mgs);
	}
	public long makecall() {
		long phoneNo = 7873249013L;
				return (phoneNo) ;
	}
	public void saveeContact() {
		System.out.println("Savee the contact No");
		
	}
	
	
	public static void main(String[] args) {
		mobile smartPhone = new mobile(); 
		smartPhone.sendMgs();
		long a = smartPhone.makecall();
		System.out.println("Make a call =" +a);
		smartPhone.saveeContact();
		
	}

}
