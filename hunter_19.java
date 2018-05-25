/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hunter_19;
import java.util.*;
/**
 *
 * @author akil
 */
public class Hunter_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int [][] a=new int[n][n];
        int [] b= new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 a[i][j]=scan.nextInt();
                 if(i==0)
                 {
                     b[j]=a[i][j];
                 }
            }
        }
         
        int ret=-1;
        for(int k=0;k<m;k++)
        {
            count=0;
            for(int i=0;i<n;i++)
            {
                ret=-1;
               ret=Arrays.binarySearch(a[i],b[k]);
               if(ret>=0)
               {
                   count++;
               }
               
            }
            if(count>=(n-2))
            {
                System.out.println(b[k]);
            }
            
        }
        
    }
    
}
