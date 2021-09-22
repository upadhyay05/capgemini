import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		LinkedList<String> a=new LinkedList<String>();
		a.add("Rajesh");
		a.add("Maduri");
		a.add("Mahesh");
		
		System.out.println(a);
		
		for(String s:a) {
			if(s.equals("Maduri")) {
				System.out.println("Maduri is inside Bag");
			}
		}

	}

}
