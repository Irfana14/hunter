/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even.no.odd.no.position;
import java.util.*;
/**
 *
 * @author akil
 */
public class EvenNoOddNoPosition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0&&(a[i]%2)!=0)
            {
                System.out.print(a[i]);
            }
            else if(i%2!=0&&(a[i]%2)==0)
            {
                System.out.print(a[i]);
            }
        }
    }
    
}
