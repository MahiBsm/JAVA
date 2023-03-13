package dailypractice;
interface d{
	abstract void intermethod();
}
abstract class Abstract{
	
	void method1() {
		System.out.println("Abstract class method");
	}
	abstract void method2();
}
class child extends Abstract implements d{
	public void method2(){
		System.out.println("child class 1");
		
	}
	public void intermethod() {
		System.out.println("abtract implementation");
	}
}

class Inheritance extends child{
	public void method2(){
		
		System.out.println("child class 2"); //override
		//super.method2();
		intermethod();	
	}

	public static void main(String[] args) {
		Inheritance obj= new Inheritance();
		obj.method2();
		obj.method1();
		

	}

}