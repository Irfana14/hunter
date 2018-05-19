/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.substring;
import java.util.*;
/**
 *
 * @author akil
 */
public class IsSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
         int m=scan.nextInt();
        int [] a=new int[n];
       
        int [] b=new int[m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=scan.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                    a[j]=0;
                    count++;
                    break;
                }
            }
        }
        if(count==m)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
