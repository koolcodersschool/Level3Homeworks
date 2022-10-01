package office_hours_5;

public class FirstLast6 {
	
	/*
	Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
	firstLast6([1, 2, 6]) → true
	firstLast6([6, 1, 2, 3]) → true
	firstLast6([13, 6, 1, 2, 3]) → false
	*/
	
	public boolean firstLast6(int[] nums) {
		  boolean firstLast6 = false;
		  if(nums[0] == 6 || nums[nums.length-1] == 6){
		    firstLast6 = true;
		  }
		  
		  
		  return firstLast6;
	}

}
