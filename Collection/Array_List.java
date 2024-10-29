import java.util.ArrayList;
import java.util.List;
public class Array_List {
    public static void main(String[] args){   
      // Collection nums=new ArrayList();
      //Collection<Integer> nums= new ArrayList<Integer>();
    	List<Integer> nums=new ArrayList<Integer>();
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	//nums.add("5");	
    	 System.out.println(nums.get(2));
    	 System.out.println(nums.indexOf(2));
			for(int n:nums)
			{
				System.out.println(n);	
			}
		//	System.err.println(nums);
			}
}
