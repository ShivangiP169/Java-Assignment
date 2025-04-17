package Sample;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		
				List<String> heros = new LinkedList<>();
				System.out.println("My Linked List:" +heros);
				
				List<String> heroines = new LinkedList<>();
				System.out.println("My Linked List:" +heroines);
				
				heros.add("Allu Arjun");
				heros.add("Nani");
				heros.add("NTR");
				heros.add("Prabas");
				heros.add("Mukesh Gowda");
				System.out.println("My Linked List After Adding:" +heros);
				
				heroines.add("Sreelela");
				heroines.add("Kajol");
				heroines.add("Sai Pallavi");
				heroines.add("Keerthy Suresh");
				heroines.add("Krithi Shetty");
				
				heros.remove(4);
				System.out.println("My Linked List After Removing:" +heros);
				
				heroines.remove(4);
				System.out.println("My Linked List After Removing:" +heroines);
				
//				String temp = heros.get(0);
//			System.out.println("My Linked List Allu Arjun:" +temp);
				
				String temp = heroines.get(0);
				System.out.println("My Linked List Sreelela:" +temp);
				
				for(String hero : heros) {
					System.out.println("My Linked List Using Iterators:" +hero);
				}
				
				for(String heroine : heroines) {
					System.out.println("My Linked List Using Iterators:" +heroines);
				}
				
				((LinkedList<String>)heros).addFirst("Sudhakar");
				System.out.println("My Linked List  Adding First:" +heros);
				
				((LinkedList<String>)heros).addLast("Ram");
				System.out.println("My Linked List  Adding Last:" +heros);
				
				
				((LinkedList<String>)heroines).addFirst("Rashmika");
				System.out.println("My Linked List  Adding First:" +heroines);
				
				((LinkedList<String>)heroines).addLast("Hansika");
				System.out.println("My Linked List  Adding Last:" +heroines);
				
	}
}


		//Linear data structures(arrays,stack,queue,Linked list)
		//Non-linear data Structures(trees,Graphs)

		//for 10 marks we need to explain(Define,Syntax,add(),remove(),set(),for loop(),addFirst(),addLast())


	


