package day25;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=1; i<=T; i++){
            int N = sc.nextInt();
            boolean isPrime = true;
            for (int j = 2; j <(int)(N/2); j++){
                if (N%j == 0){
                    isPrime = false;
                    break;
                }
            }if (N < 2 || (N > 2 && (N&1) == 0)){
                System.out.println("Not prime");
            }else{
                if(isPrime){
                    System.out.println("Prime");
                }else{
                    System.out.println("Not prime");
                }
            }
        }
    }
    
}
