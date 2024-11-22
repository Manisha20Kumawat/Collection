import java.util.HashMap;

public class MapConcept 
{
    public static void main(String[] args) 
    {
        //HashMap map = new HashMap();
        
        HashMap<Integer,Integer>map1 = new HashMap<Integer,Integer>();
        map1.put(121,233);
        
        System.out.println(map1);
        
        HashMap<Integer,String>map = new HashMap<Integer,String>();
        map.put(1211,"manisha"); //key:- unique, value:may be duplicate
        map.put(1211,"kiran");
        map.put(211,"vinod");
        map.put(21,"anil");
        map.put(12,"sumit");
        map.put(11,"sumit");
        
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
 
}
