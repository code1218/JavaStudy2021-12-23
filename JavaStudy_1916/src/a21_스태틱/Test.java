package a21_스태틱;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add(null);
		list.add("a");
		list.add(null);
		list.add("a");
		list.add("a");
		list.add("a");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == null) {
				continue;
			}
			System.out.println(list.get(i));
		}
		
	}
}
