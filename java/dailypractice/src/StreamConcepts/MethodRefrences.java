package StreamConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import java.util.stream.Collectors;

public class MethodRefrences {
	public static void main(String args[]) {
		Movie movie1=new Movie();
		movie1.setActorname("surya");
		movie1.setMoviename("vikram");
		movie1.setYear("2001");
		
		Movie movie2=new Movie();
		movie2.setActorname("vijay");
		movie2.setMoviename("Beast");
		movie2.setYear("1998");
		
		Movie movie3=new Movie();
		movie3.setActorname("mahitha");
		movie3.setMoviename("aspire");
		movie3.setYear("2001");
		
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(movie1);
		list.add(movie2);
		list.add(movie3);
		
		
    	method(list,(x)-> x.getActorname()=="surya");
//		method(list,(x)-> x.getYear()=="2001");
		
		
//	      list.stream().filter(x->x.getYear()=="2001").forEach(System.out::print);
		
		 Predicate<String> mahi=(name)->{if(name.equals("Mahi"))
				 {return true;} 
		 return false;
		};
		System.out.println(mahi.test("Mahil"));
		
	}
	
	
	public static void method(List<Movie> list,Predicate<Movie> predict) {
		for(Movie movie:list) {
			if(predict.test(movie)) {
				System.out.println(movie.getActorname() + " " + movie.getMoviename() + " " + movie.getYear());
			}
		}
		
	}



}
