/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.closest.to.zero;
import java.util.*;
/**
 *
 * @author akil
 */
public class SumClosestToZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int [] a=new int[n];
        int temp=1000000;
        int[] b= new int[2];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int k=a[i]+a[j];
                if(k<temp&&k>=0)
                {
                    b[0]=a[i];
                    b[1]=a[j];
                    temp=k;
                }
            }
        }
           
        for(int i=0;i<2;i++)
        {
            System.out.println(b[i]);
        }
    }
    
}
