/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_word;
import java.util.*;
/**
 *
 * @author akil
 */
public class Reverse_word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            StringBuilder sb=new StringBuilder(str1[i]);
            
            System.out.print(sb.reverse());
            System.out.print(" ");
        }
        
        
    }
    
}
