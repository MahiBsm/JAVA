package collectionpractice;
import java.util.*;import java.util.stream.Collector;
import java.util.stream.Collectors;

interface inter{

	static void m1(){
		HashSet<String> s= new HashSet<String>();
	s.add("mahitha");
	s.add("mouli");
	s.add("ravi");
	s.add("jaya");
	s.add("vinu");
	 System.out.println(s);}
}
public class List implements inter {

	public static void main(String[] args) {
		/*Linkedlist<Integer> list=new Linkedlist<Integer>();
		list.addelements(10);
		list.addelements(16);
		list.addelements(18);
		list.viewfront();
		list.viewback();
		Linkedlist<String> list1=new Linkedlist<String>();
		list1.addelements("mahitha");
		list1.addelements("mouli");
		list1.addelements("jaya");
		list1.addelements("sumeka");
		list1.viewfront();
		list1.viewback();
		
		Set <Integer> list2= new HashSet<Integer>();
		list2.add(90);
		list2.add(80);
		list2.add(70);
		System.out.println(list2);
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(80);
		
		list2.removeAll((list3));
		System.out.println(list2);*/
		
		//List l= new List();
		//l.m1();
		//inter.m1();
		 /*LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); */ 
		
		//comparatorl
		String s="Subash";
		Set <Integer> set= new TreeSet<Integer>();
		set.add(90);
		set.add(80);
		set.add(70);
		set.add(10);
		set.add(50);
		set.add(80);
		set.add(40);
		set.add(100);
		Set mahi=set.stream().sorted().collect(Collectors.toSet());
		System.out.println(mahi);
		System.out.println(set);
//		try {
//			MyComparator.err();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("hey!!! hiii");
		
	
	}

}





