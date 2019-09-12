package Dynamic_Table;

import java.util.LinkedList;
import java.util.Iterator;
public class AddElement {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("Delhi");
    linkedlist.add("Agra");
    linkedlist.add("Mysore");
    linkedlist.add("Chennai");
    linkedlist.add("Pune");
    //linkedlist.addFirst("Gunjali");
   // linkedlist.addLast("Gunjali");

    // Adding new Element at 5th Position 
    linkedlist.add(4, "NEW ELEMENT");
    linkedlist.offerFirst("Berry");
    linkedlist.removeFirst();
    linkedlist.removeLast();
    linkedlist.remove(1);
   // linkedlist.removeAll(linkedlist);
    Object linked = linkedlist.getFirst();
    System.out.println(linked);
    Object linked1 = linkedlist.getLast();
    System.out.println(linked1);

    // Iterating the list in forward direction
    System.out.println("LinkedList elements After Addition:");
    Iterator it = linkedlist.iterator();
    while(it.hasNext()){
    	System.out.println(it.next());
    }
    }
 }
