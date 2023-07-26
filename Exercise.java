import java.util.Arrays;

public class Exercise {

    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
//        for(int score=0;score<array.length;score++){
//            System.out.println(score);
//            if (score > firstHighest) {
//                secondHighest = firstHighest;
//                firstHighest = score;
//            } else if (score > secondHighest && score < firstHighest) {
//                secondHighest = score;
//            }
//        }
        for (int score : array) {
            System.out.println(score);
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        System.out.println(Arrays.toString(new int[]{firstHighest, secondHighest}));
        return new int[]{firstHighest, secondHighest};


    }



    public static void main(String[] args) {
        int[] array =  new int[]{84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        Exercise exercise = new Exercise( );
        exercise.findTopTwoScores(array);


    }
}
