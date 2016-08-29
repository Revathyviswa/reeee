/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rev;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Rev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int count=0;
        s=sc.nextLine();
        for(int i='a';i<='z';i++)
        {
            for(int k=0;k<s.length();k++){
            if(i==s.charAt(k)){
                count++;}
        }}
  if(count<=26)
            {
                System.out.println("panagram");
            }
            else
                System.out.println("not panagram");
    
}
    }

