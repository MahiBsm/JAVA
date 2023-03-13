package dailypractice;
class Polydemo{
	int a=10,b=6;
	public int result() {
		return a+b;
	}
}

public class Polymorphism extends Polydemo {
	//overriding
	public int result() {
		int c;
		 c=(a+b)/2;
		 return c;
	}
	//overloading
	public void display(String name, int Rollno) 
	{
		System.out.println(name + " "+Rollno);
	}
	
	public void display() {
		System.out.println("displayig the method");
	}
	

	public static void main(String[] args) {
		Polymorphism poly= new Polymorphism();
		poly.display("mahi", 101);
		System.out.println(poly.result());
		
	}

}
