//This program reverses a String in Java

import java.util.Scanner;
public class ReverseofaString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to be reversed = ");
        String str = sc.nextLine();
        sc.close();
        String str1 = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1 = str1 + str.charAt(i);
        }
        System.out.println("Reversed String = "+str1);
    }
}