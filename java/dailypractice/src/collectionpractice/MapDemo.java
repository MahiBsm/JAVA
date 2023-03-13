package collectionpractice;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Mahitha vahi=new Mahitha();
		Mahitha vahi1=new Mahitha();
		HashMap<Integer,Mahitha> map=new HashMap<Integer,Mahitha>();
		map.put(1,vahi);
		map.put(2, vahi1);
		
		
		Iterator<Map.Entry<Integer,Mahitha>> itr=map.entrySet().iterator();
		
//		map.forEach((k,v)->{
//			System.out.println(k + " " + v);
//		});  stream API and lambda function
		
		while(itr.hasNext()) {
			Map.Entry<Integer,Mahitha> entry=itr.next();
			System.out.println(entry.getKey());
		}
		
		map.keySet().forEach((k) -> System.out.println((k + ":" + map.get(k))));
		
		System.out.println(map);
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(101, "mahi");
		hm.put(102, "hari");
		hm.put(103, "kavi");
		hm.put(104, "dev");
		hm.put(105, "manisha");
		
		System.out.println(hm);
		
//		Set s1=hm.entrySet();
//		System.out.println(s1);
		
		for(Map.Entry value:hm.entrySet()) {
			System.out.println(value.getKey() + " " + value.getValue()) ;
		}
		
		for(Integer key:hm.keySet()) {
			System.out.println(key);
		}
		for(String value:hm.values()) {
			System.out.println(value);
		}
	}

}
