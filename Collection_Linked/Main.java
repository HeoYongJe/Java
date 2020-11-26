package 컬렉션;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<String> staff = new LinkedList<>();

			staff.add("a");
			staff.add("b");
			staff.add("c");

			Iterator iter = staff.iterator();
			iter.next();
			iter.next();
			iter.next();	
			iter.remove();
			for(String s : staff)
				System.out.println(s);
	}

}
