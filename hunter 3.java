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
        int[] a= new int[n];
        int [] b= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            
        }
        
        
        
        for(int i=n-1;i>=0;i--)
        {
            if(i==a[i])
            {
                b[i]=a[i];
            }
           
        }
        Arrays.sort(b);
        for(int i=0;i<b.length;i++)
        {
            if(b[i]>0)
            {
            System.out.println(b[i]);
            }
            
        }
        
    }
    
}
