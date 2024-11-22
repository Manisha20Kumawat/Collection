import java.util.ArrayList;
public class ListConcept 
{
    public static void main(String...args)
    {
        ArrayList list = new ArrayList();
        list.add(1234);
        list.add("manisha");
        list.add(75.8f);
        list.add(12.2344);
        list.add(123423);
        list.add(true);
        System.out.println(list);
        
        System.out.println(list.get(3));//to access specific index element;
        list.remove(3);
        System.out.println(list);
        
        list.removeAll(list);
        if(list.isEmpty())
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println(list);
        }
    }
}
