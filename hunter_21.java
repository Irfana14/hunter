/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertmatrixtozero;
import java.util.*;
/**
 *
 * @author akil
 */
public class Convertmatrixtozero {

    /**
     * @param args the command line arguments
     *///9629622760
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int [][] a=new int[n][m];
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               a[i][j]=scan.nextInt();
            }
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==0)
                {
                    for(int k=0;k<m;k++)
                    {
                        a[i][k]=0;
                    }
                    for(int l=0;l<n;l++)
                    {
                        a[l][j]=0;
                    }
                }
            }
           
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.printf("\t %d",a[i][j]);
            }
             System.out.println();
        }
    }
    
}
