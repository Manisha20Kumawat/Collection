import java.util.LinkedList;
import java.util.Collections;

public class ListConcept2 
{
    public static void main(String[] args) 
    {
        //list of type String
        // peek(),poll(),offer()
        //peek():- used to access head element of the list
        //poll():-used to delete the head element of the list
        //offer():- used to add the element at the tail of the list
       
        LinkedList<String> list = new LinkedList<String>();
        list.add("manisha");
        list.add("sapna");
        list.add("kiran");
        list.add("ashok");
        list.add("anil");
        list.add("manisha");
        
        list.poll();
        list.poll();
        
        System.out.println(list.peek());
        
        list.offer("MBM");
        list.add("BGM");
        System.out.println(list);
    }
}
