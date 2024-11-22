import java.util.ArrayList;
import java.util.Collections;

public class ListConcept1 
{
    public static void main(String[] args) 
        {
          ArrayList<String> list = new ArrayList<String>();//list of type String
          list.add("manisha");
          list.add("kiran");
          list.add("anju");
          list.add("sapna");
          list.add("sumit");
          list.add("vinod");
          
          for(int i=0;i<list.size();i++)
          {
              System.out.println(list.get(i));
          }
        }
}

