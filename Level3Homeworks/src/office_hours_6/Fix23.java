package office_hours_6;

public class Fix23 {
	/*
	Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
	fix23([1, 2, 3]) → [1, 2, 0]
	fix23([2, 3, 5]) → [2, 0, 5]
	fix23([1, 2, 1]) → [1, 2, 1]
	*/
	
	public int[] fix23(int[] nums) {
		  int[] fix23 = new int[3];
		  if(nums[0] == 2 && nums[1] == 3){
		    fix23[0] = nums[0];
		    fix23[1] = 0;
		    fix23[2] = nums[2];
		  }else if (nums[1] == 2 && nums[2] == 3){
		    fix23[0] = nums[0];
		    fix23[1] = nums[1];
		    fix23[2] = 0;
		  }else{
		    fix23[0] = nums[0];
		    fix23[1] = nums[1];
		    fix23[2] = nums[2];    
		  }
		  
		  
		  return fix23;
	}

}
