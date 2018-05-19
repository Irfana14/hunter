/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to.sum.no.to.get.element.in.array;
import java.util.*;
/**
 *
 * @author akil
 */
public class ToSumNoToGetElementInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] a= new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                k=a[i]+a[j];
                for(int l=j+1;l<n;l++)
            {
                if(k==a[l])
                {
                    System.out.println(a[i]+"+"+a[j]+"="+k);
                }
            }
                }
            }
                
            
        }
        
        
    }
    
}
