package ArrayList;

import java.util.*;


public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Datebase");
		list.add("Java");
		list.add("Html");
		list.add("Css");
		list.add("JavaScript");
		
		int size = list.size(); //저장된 총 객체 수 얻기
		
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i=0;i<list.size();++i) {
			String str = list.get(i);
			System.out.println(i + ":" + str); //저장된 총 객체 수만큼 루핑
		}
		System.out.println("---------------------------");
		list.remove(2);
		list.remove(2);
		list.remove("JavaScript");
		
		for(int i=0;i<list.size();++i) {
			String str = list.get(i);
			System.out.println(i + ":" + str); //저장된 총 객체 수만큼 루핑
		}
	}

}
