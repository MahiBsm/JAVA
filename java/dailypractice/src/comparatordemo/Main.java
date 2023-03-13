package comparatordemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
	ArrayList<Student> studenList=new ArrayList<>();
	studenList.add(new Student("Abash", 5));
	studenList.add(new Student("Mahitha", 1));
	studenList.add(new Student("Kumaresan", 3));
	studenList.add(new Student("Subashk", 4));
	List<Student> st=studenList.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
	System.out.println(st);
	List<Student> sortbyname=studenList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	System.out.println(sortbyname);
}
}
