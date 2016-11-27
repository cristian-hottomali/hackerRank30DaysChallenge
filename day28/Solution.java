package day28;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        Pattern pattern = Pattern.compile(".+@gmail\\.com$");
        List<String> list = new ArrayList();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            
            Matcher matcher = pattern.matcher(emailID);
            if(matcher.find()){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
}