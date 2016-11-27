package day16;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            int ss = Integer.parseInt(s);
            System.out.println(ss);
        } catch(Exception e) {
            System.out.println("Bad String");
        }
    }
}
