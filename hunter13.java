/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_string_by_stack;
import java.util.*;
/**
 *
 * @author akil
 */
public class Reverse_string_by_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        Stack<Character> stack= new Stack<Character>();
        
        String str= scan.nextLine();
        
        char [] ch=str.toCharArray();
        boolean x=false;
        for(int i=0;i<str.length();i++)
        {
            stack.push(ch[i]);
        }
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==stack.peek())
            {
                stack.pop();
            }
        }
        
       if(stack.empty())
       {
           x=true;
       }
       if(x==true)
       {
           System.out.println("ITS A PALINDROME");
       }
       else
       {
           System.out.println("ITS NOT A PALINDROME");
       }
        
         
    }
    
}
