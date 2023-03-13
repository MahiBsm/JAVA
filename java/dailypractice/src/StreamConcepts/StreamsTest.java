package StreamConcepts;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
	public static void main(String args[]) {
		List<Integer> list=Arrays.asList(9,87,6,4,3,3,2,21,3);
		List<String> lis=Arrays.asList("mahitha","mahi");
		
		list.stream().map((x)->x*2).forEach(System.out::println);
		System.out.println("-----------------------------------------");
		list.stream().filter((x)->x%2==0).forEach(System.out::println);
		System.out.println("-----------------------------------------");
		System.out.println(list.stream().count());
		System.out.println("-----------------------------------------");
		List<Integer> list1=list.stream().filter((x)->x>20).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println("-----------------------------------------");       
		System.out.println(list.stream().max(Comparator.reverseOrder()) );
		System.out.println("-----------------------------------------");   
		Object[] list2=lis.stream().filter((x)->x.length()>4).toArray();
		System.out.println(list2);
		System.out.println("-----------------------------------------");   
		Iterator itr=list.iterator();
		int i=0;
		while(itr.hasNext())
		{
		
			if(list.get(i)>4)
			{
			System.out.println(itr.next());  
			i++;
			}
			
		}
		
	}

}
