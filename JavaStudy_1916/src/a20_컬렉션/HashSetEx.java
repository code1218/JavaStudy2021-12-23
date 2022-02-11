package a20_컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("김");
		set.add("준");
		set.add("일");
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			
			if(str.equals("이")) {
				System.out.println(str);
			}
		}
		
		set.remove("일");
		
		System.out.println(set);
		

	}

}
