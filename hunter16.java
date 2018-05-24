/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nearest_3_no;
import java.util.*;
/**
 *
 * @author akil
 */
public class Nearest_3_No {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            
        }
        Arrays.sort(a);
        int l=0,r=n-1,j=-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(a[mid]==k)
            {
             j=mid;
             break;
            }
            else if(k>a[mid])
            {
                l=mid+1;
            }
            else if(k<a[mid])
            {
                r=mid-1;
            }
        }
        if(j<=(n-2)&&j>1)
        {
            System.out.println(a[j+1]+" "+a[j-1]+" "+a[j-2]);
            
        }
        else if(j>(n-2))
        {
             System.out.println(a[j-3]+" "+a[j-1]+" "+a[j-2]);
        }
        else if(j==1)
        {
            System.out.println(a[j+1]+" "+a[j-1]+" "+a[j+2]);
            
        }
        else if(j==0)
        {
            System.out.println(a[j+1]+" "+a[j+3]+" "+a[j+2]);
            
        }
    }
    
}
