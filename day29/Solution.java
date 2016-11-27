package day29;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            int result = 0;
		    for (int x = 1; x <= n; x++) {
                for (int y = x + 1; y <= n; y++) {
                    int current = x & y;
                    if (current > result && current < k) {
                        result = current;
                    }
                }
            }
            System.out.println(result);
		}
		in.close();
    }
}