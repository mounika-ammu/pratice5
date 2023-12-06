package collect;


import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String[] args) {
		LinkedList<String>li=new LinkedList<String>();
		li.add("mounika");
		li.add("mounika");
		li.add("san");
		li.add(0, "vani");
		System.out.println(li.pop());
		System.out.println(li);
		LinkedList<String>li2=new LinkedList<String>();
		li2.add("saravani");
		li2.add("sandeep");
		li2.add("sandeep");
		System.out.println(li2);
		li.addAll(li2);
		li.addAll(2, li2);
		System.out.println(li);
		li.addFirst("sai");
		li.addLast("ragg");
		System.out.println(li);
		li.remove("sai");
		li.removeLast();
		li.removeFirst();
		System.out.println(li);
		li.removeFirstOccurrence("mounika");
		System.out.println(li);
		
		
		
		}
		
	}


