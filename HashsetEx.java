import java.util.*;
public class HashsetEx{
public static void main(String[] args)
{
HashSet<String> set = new HashSet<String>();
set.add("ravi");
set.add("ravi");
set.add("priya");
set.add("Surya");
Iterator<String> itr = set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}

