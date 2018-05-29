/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryrnge;
import java.util.*;
/**
 *
 * @author akil
 */
public class Binaryrnge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
       int b=scan.nextInt();
       int cot=0;
        for(int i=a;i<b;i++)
        {
            int count=0,c=0,m=0,l=0;
            l=i;
            while(l>0)
            {
                c=l%2;
                if(c==1)
                {
                    count++;
                }
                l=l/2;  
                
            }
           
            
            for(int k=2;k<count;k++)
            {
                if((count%k)==0)
                {
                    m++;
                }
                 
            }
            if(m==0)
            {
            cot++;
            }
        }
        System.out.println(cot);
            /*if(m<1)
            {
             System.out.println(i);
            }
          //System.out.println();  
            */
        
        
    }
    
}
