package office_hours_6;

public class MakeMiddle {
	/*
	Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
	makeMiddle([1, 2, 3, 4]) → [2, 3]
	makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
	makeMiddle([1, 2]) → [1, 2]
	*/
	
	public int[] makeMiddle(int[] nums) {
		  int[] makeMiddle = new int[2];
		  
		  if(nums.length > 2){
		    int middle1 = (nums.length/2)-1;
		    int middle2 = (nums.length/2);
		    makeMiddle[0] = nums[middle1];
		    makeMiddle[1] = nums[middle2];
		  }else if(nums.length == 2){
		    makeMiddle[0] = nums[0];
		    makeMiddle[1] = nums[1];
		  }

		  
		  return makeMiddle;
	}

}
