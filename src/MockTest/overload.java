package MockTest;

public class overload {
	public void Studentdetails(String msg ){
		System.out.println("this is "+msg);
	}
	
public void studentdetails(String name , int age) {
	System.out.println("studentname is "+name+". "+age);
	
}
public void studentdetails(String place) {
	System.out.println("location is "+place);
	
}
public void studentdetails(int pin) {
	System.out.println("pincode is "+pin);
	
}
public static void main(String[] args) {
	overload a = new overload();
	a.Studentdetails("form fill up");
	a.studentdetails("bhuvana",20);
	a.Studentdetails("Chennai");
	a.studentdetails(605009);
}
	

	
}

