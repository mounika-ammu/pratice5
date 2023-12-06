package Vector;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String>vec1=new Vector<String>();
		vec1.add("mounik");
		vec1.add("hgdhg");
		vec1.add("hgdhsgdh");
		vec1.add("fdgfdg");
		vec1.addElement("gfdfhdg");
		System.out.println(vec1);
		 System.out.println(vec1.size());
		vec1.capacity();
		System.out.println(vec1.capacity());
		System.out.println(vec1.firstElement());
		System.out.println(vec1.lastElement());
		if(vec1.contains("rrr")) {
			System.out.println(vec1.indexOf("rrr"));
		}
		else {
			System.out.println("element not found");
		}
	}
		
		
	

}
