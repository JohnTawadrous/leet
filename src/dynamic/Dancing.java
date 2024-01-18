package dynamic;

public class Dancing {

    public static void main(String[] args) {

        int answer = dancer(8);

        System.out.println(answer);
    }
    public static int dancer(int n){

        int[] steps = new int[n + 1];
        int position = -1;

        steps[0] = 0;
        steps[1] = 1;
        steps[2] = -2;

        for(int i = 3 ; i < steps.length ; i++){
            steps[i] = steps[i -1] - steps[i - 2];
            position = position + steps[i];
        }

        return position;
    }

}

//stage = steps =  position
//0 = 0
//1 = 1 -- 1
//2 = -2 -- -1
//3 = -3  -- -4
//4 = -1 (-3 - -2) -- -5
//5 = 2 (-1 - -3) -- -3
//6 = 3(2 - -1) -- 0
//7 = 1 (3 - 2) -- 1
//8 = -2 (1 - 3) -- -2
//9 = -3 (-2 - 1) -- -5
//10 = -1 (-3 - -2) -- -6
//11 = 2 (-1 - -3) -- -4
//12 = 3 (2 - -1) -- -1