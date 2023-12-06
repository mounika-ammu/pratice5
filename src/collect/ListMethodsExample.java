package collect;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsExample {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		for( int i=10;i<=100;i=i+10) {
			li.add(i);
		}
		System.out.println("li after insert"+li);
		li.add(2, 500);
		System.out.println("li after replacement "+li);
		li.set(5, 1000);
		System.out.println("li"+li);
		List<Integer> SecondList=new ArrayList<Integer>();
		SecondList.add(2000);
		SecondList.add(5000);
		SecondList.add(4000);
		SecondList.add(3000);
		System.out.println("Secondlist"+SecondList);
	li.addAll(5,SecondList);
	System.out.println("firstlist"+li);
	if(li.contains(5)) {
		System.out.println("li contains 5000");
	}
	else {
		System.out.println("list not contains number");
	}
	for(int i=0;i<li.size();i++) {
		System.out.println(li.get(i));
	}
	li.remove(0);
	System.out.println(li);
	}
	   

}
