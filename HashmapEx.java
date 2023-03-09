import java.util.*;
public class HashmapEx{
public static void main(String[] args)
{
Map<Integer,String> map= new HashMap<Integer,String>();
map.put(100,"Amit");
map.put(101,"Priya");
//map.put("");
map.put(100,"Amit");
//Collection.sort(map, Collection.reverseOrder());
//System.out.println(map);
for(Map.Entry m:map.entrySet()){
System.out.println(m.getKey()+ " "+m.getValue());
}
}
}