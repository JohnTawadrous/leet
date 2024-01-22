package binarySearch;

public class BinarySearch {

    public int search(int[] nums, int target) {

        //pointer to our first value and last one in the sorted array
        int left = 0;
        int right = nums.length - 1;

        //loop to compare target to middle number
        while(left <= right){

            //finding middle value
            int mid = (left + right) / 2;
            int pointedNumber = nums[mid];

            //target found
            if(pointedNumber == target) return mid;

            //if target is smaller or bigger than middle value
            if(pointedNumber < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        //if target not found
        return -1;

    }
}
