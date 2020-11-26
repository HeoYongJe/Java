package 컬렉션;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class LinkedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new LinkedList<>();
		a.add("kim");
		a.add("kim2");
		a.add("kim3");
		List<String> b = new LinkedList<>();
		b.add("park");
		b.add("park2");
		b.add("park3");

		//b를 a로 병합
		ListIterator<String> aiter = a.listIterator();
		Iterator<String> biter = b.iterator();
		while(biter.hasNext()) {
			if(aiter.hasNext()) aiter.next();
			aiter.add(biter.next());
		}
		System.out.println(a);
	}

}
