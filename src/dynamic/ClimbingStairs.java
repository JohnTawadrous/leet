package dynamic;

public class ClimbingStairs {

    public int climbStairs(int n){
        //known result
        if(n == 1) return 1;

        //create new array with n+1 length since we start at 1 step
        int[] arr = new int[n + 1];

        //fill first 2 possibilities
        arr[1] = 1;
        arr[2] = 2;

        //logic to fill array with distinctive ways
        for(int i = 3 ; i <= n ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        //return the value assigned to the n index
        return arr[n];
    }
}
