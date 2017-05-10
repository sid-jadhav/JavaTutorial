package ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

// hasNext
public class RunThisListIterator {

	public static void main(String[] args) {
		ArrayList<String> name =new ArrayList<>();
		name.add("Siddhesh");
		name.add("Madan");
		name.add("Jadhav");
		ListIterator<String> itr= name.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}

}
