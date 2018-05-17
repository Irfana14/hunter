/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication94;
import java.util.*;
/**
 *
 * @author akil
 */
public class JavaApplication94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int [] a= new int[n];
        ArrayList<Integer> list =
                        new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
           list.add(a[i]);
            
        }
        
        
        
        for(int i=0;i<n;i++)
        {
            int f=Collections.frequency(list,a[i]);
            if(f==1)
            {
                System.out.print(a[i]);
            }
            
        }
        
    }
    
}
