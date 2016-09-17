package Carlo;

import java.util.Scanner;




public class CableCar {
    
    public static int [] heightMasts;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numCableCar = in.nextInt();  
        int m = 1;        
        for (int i = 0; i < numCableCar; i++){

            int numMasts = in.nextInt();
            heightMasts = new int [numMasts];
            for (int j = 0; j < numMasts; j++){
                heightMasts[j] = in.nextInt();
            }
            solveProblem1and2(heightMasts, m);
            m++;
        }
    }
    
    public static void solveProblem1and2 (int [] heightMasts, int m){
       int heightDifference = heightMasts[1] - heightMasts[0];
       int k = 0;
       boolean Boolean = true;
       for(int j = 1; j < heightMasts.length; j++){
           int nextHeightDifference = heightMasts[j] - heightMasts[k];
           if(nextHeightDifference != heightDifference){
               Boolean = false;
           }

           if(Boolean == false){
               System.out.println("case #" + m + ": no");
               j = heightMasts.length;
           }
           k++;
       }
       if(Boolean == true){
           System.out.println("case #" + m + ": yes");
       }
    }
    
}