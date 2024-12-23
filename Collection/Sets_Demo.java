import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Sets_Demo {
    public static void main(String[] args){   
    	
       Set<Integer> nums=new HashSet<Integer>();  
      // Set<Integer> nums=new TreeSet<Integer>();

    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	nums.add(5);
    	
			for(int n:nums)
			{
				System.out.println(n);
			}
    }
}




    

