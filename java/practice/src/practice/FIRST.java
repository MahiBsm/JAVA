package practice;



interface a {
	static void mm(){ 
		  System.out.println("static outer interface");
	  }
  public void m1();
  interface s{
	  default void mm(){ 
		  System.out.println("default inner interface");
	  }
  }
    
static void m9() {
	  System.out.println("static outer interface");
 
  }
}
interface b {
	 public void m1();	
}
 
class d implements a.s{
	d(){
		  System.out.println("d constructor");
		  
	  }
	public void mm() {
		  System.out.println("calling default inner interface");
		  a.s.super.mm(); 
	  }
	  
}
class child extends Demo implements a,b{
	public String toString() {
		return "duhdsgfyu";
	}
     void fun() {
    	 System.out.println("abstract child method");
    	 
    }
     static void mm() {
		  System.out.println("calling default outer interface");
		  a.mm(); 
	  }
    
	child(){
		System.out.println("child constructor");
	
	}
	
	public void m1() {
		
		System.out.println("hii");
	}
	public void m2()
	{
		a.m9();
	}
	
}

 class FIRST extends child {
	 FIRST(){
		  super(); // constructor 
	  }
	public static void main(String[] args) {
		child f= new child();
		Object[] a=new Object[100];
	    a[0]=f;
	    System.out.println(a[0].toString());
		d obj= new d();
		obj.mm();
		f.show();
		f.fun();
		f.m1();
		f.m2();
	
	
	}
    
	
}



