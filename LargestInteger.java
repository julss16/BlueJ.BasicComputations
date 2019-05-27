 

import java.lang.Math;
import java.util.Scanner;
public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int a= 10;
        int b= 20;
        int c= 30;
       int max = c > (a>b ? a:b) ? c:((a>b) ? a:b);
         return max;
        
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Scanner numb= new Scanner(System.in);
        int a= numb.nextInt();
        int b= numb.nextInt();
        int c= numb.nextInt();
        
        return Math.max(a,(Math.max(b,c)));
        
        
    }
}
