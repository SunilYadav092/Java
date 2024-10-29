import java.util.HashMap;
import java.util.Map;

public class Map_Demo {
    public static void main(String[] args){   
    	
    	Map<String, Integer> students=new HashMap<>();
    //	Map<String, Integer> students=new Hashtable<>(); //synchronized
    	
    	students.put("Abilash",56);
    	students.put("Bharath",23);
    	students.put("Chethan",67);
    	students.put("Dharshan",92);
    	students.put("Esha",45);
    	
    	System.out.println(students.keySet());
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + ":" + students.get(key));
    	}
    	
    }
}