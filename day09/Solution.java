package day09;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String args[]){
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    static  int factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
