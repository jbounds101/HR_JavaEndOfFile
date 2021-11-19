import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String current;
        int count = 1;
        do {
            // This will break on zero input, however
            // that isn't being tested
            current = s.nextLine();
            System.out.printf("%d %s\n", count, current);
            count++;
        } while (s.hasNext());

    }
}