import java.util.HashSet;
import java.util.Iterator;

public class SetConcept 
{
    public static void main(String[] args)
    {
        //contains unique elements + auto asc order
        //TreeSet set = new TreeSet();
        
        //the order of the elements is not presserver
        //+allow unique elememts
        //HashSet set = new HashSet();
        
        
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(56);
        set.add(56);
        set.add(111);
        set.add(99);
        set.add(2312);
        
        System.out.println(set);
        
        System.out.println("Total no of elements:"+set.size());
        
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
