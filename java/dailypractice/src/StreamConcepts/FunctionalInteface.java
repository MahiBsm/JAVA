package StreamConcepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class FunctionalInteface {
	
	public static void main(String args[]) {
		BiFunction<Integer,Integer,Integer> bifunc=work::addTwonumber;
		System.out.println(bifunc.apply(10, 20));
		
		List<Integer> list=Arrays.asList(1,2,3,4,8,3,4,2,1);

		list.sort(Integer::compareTo);
		
		System.out.println(list);
	    
	}

}


class work{
	public static Integer addTwonumber(Integer i,Integer j) {
		return i+ j;
	}
}
