package LinkedList;

import java.util.LinkedList;

public class RunThisLinkedList {

	public static void main(String[] args) {
			LinkedList<String> name= new LinkedList<String>();
			name.add("King");
			name.addFirst("Tuch king");
			name.addLast("Sid is king");
			for(String x:name)
			{
				System.out.println(x);
			}
			name.removeLast();
			for(String x:name)
			{
				System.out.println(x);
			}
			System.out.println(name.size());
	}

}
