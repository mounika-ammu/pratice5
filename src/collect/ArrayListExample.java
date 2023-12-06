package collect;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("mounika");
		s1.add("mouni");
		s1.add("alla");
		s1.remove(s1.size()-1);
		Iterator i=s1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
		
	}
	

}
