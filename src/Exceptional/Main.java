package Exceptional;
import java.util.*;



public class Main {

    

    public static int[] findTopTwoScores(int[] scores) {

        int scoresize = scores.length;


        int i = 0;

            for(i = 0 ; i < scoresize/2 ; i++) {

                int j = scoresize -1;

                scores[i] = scores[j];

                j--;

            }
            return scores;

        }



 

    



    // DO NOT TOUCH THE CODE BELOW

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        sc.close();

        System.out.println(Arrays.toString(findTopTwoScores(arr)));

    }

}