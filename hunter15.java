/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum_of_no;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sum_Of_NO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int sum=0;
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
    
}
