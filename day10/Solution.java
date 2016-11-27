package day10;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String binary = Integer.toBinaryString(n);
		int maxConsecutiveNum = 0;
		int consecutiveNum = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				consecutiveNum++;
				maxConsecutiveNum = Math.max(maxConsecutiveNum, consecutiveNum);
			} else {
				consecutiveNum = 0;
			}
		}
		System.out.println(maxConsecutiveNum);

		in.close();
	}
}
