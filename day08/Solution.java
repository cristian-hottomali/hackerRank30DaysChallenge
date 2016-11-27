package day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> namePhone = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            namePhone.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (namePhone.containsKey(s)) {
				System.out.println(s + "=" + namePhone.get(s));
			} else {
				System.out.println("Not found");
			}
        }
        in.close();
    }
}
