package ArrayList;

import java.util.ArrayList;

public class RunThisArrayList {

	public static void main(String[] args) {
		int simple_array[]= new int[15];
		ArrayList<Integer> MyArray =new ArrayList<Integer>(15);
		MyArray.add(2);
		MyArray.add(22);
		MyArray.add(222);
		MyArray.add(2222);
		MyArray.add(222);
		MyArray.add(22);
		MyArray.add(2);
		for(Integer x : MyArray){
			System.out.println(x);
		}
		System.out.println(MyArray.size());
		MyArray.remove(3);
		for(Integer x : MyArray){
			System.out.println(x);
		}
		System.out.println(MyArray.size());
		
		
	}

}
