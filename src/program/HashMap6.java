package program;

import java.util.HashMap;
import java.util.Set;

public class HashMap6 {

	public static void main(String[] args) {
		HashMap<String,Integer> map= new HashMap<>();

		map.put("China",1);
		map.put("India",2);
		map.put("USA",3);
		map.put("Japan",4);

		Set<String> keys=map.keySet();

		for(String i:keys){
		System.out.println(i+" "+map.get(i));
		}
		

		System.out.println(	map.containsKey("Indonesia"));
		map.remove("China");
		System.out.println(map);

	}

}
