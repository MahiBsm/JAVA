package collectionpractice;

import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
//	public static void err()throws Exception  {
//		if(true) {
//			throw new Exception("error");
//		}
//	}
//	public int compare(Object o1, Object o2) {
//
//		/*if (i1<i2) 
//			return +1;
//		else if(i1>i2)
//		 	return -1;
//		else
//			return 0;*/
//		
//		//return -i1.compareTo(i2); // descending order (given -)
//		
//		//return +1; returns insertion order
//		//return 0; returns only first element
//	}


public int compare(Integer o1, Integer o2) {
	Integer i1=(Integer) o1;
	Integer i2=(Integer) o2;
	return i2.compareTo(i1);
	
}}