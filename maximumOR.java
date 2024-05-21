import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int or=0;
		 int n=nums.length;
		 for(int i=0;i<n;i++)
			 or|=nums[i];

		 List<List<Integer>> list2 = new ArrayList<List<Integer>> ();
			 int c=0;
	        for(int i=0;i<1<<n;i++)
	        {
	        	List<Integer> list1 = new ArrayList<>();
	            for(int j=0;j<n;j++)
	            {
	                if((i & (1<<j))>0)
	                list1.add(nums[j]);
	               
	            }
	            int or1=0;
	            for(int ii=0;ii<list1.size();ii++)
	            {
	            	 or1 = or1 | list1.get(ii) ;
	            	
	            }
                if(or1 ==or)
	            		c++;
	            list2.add(list1);
	        }
	        return c;
    }
}