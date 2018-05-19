/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frst.repeat;
import java.util.*;
/**
 *
 * @author akil
 */
public class FrstRepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> obj= new ArrayList<Integer>();
        int n=scan.nextInt();
        int[] a= new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            obj.add(a[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            int f=Collections.frequency(obj, a[i]);
            if(f>1)
            {
                cnt=i;
                break;
            }
        }
        System.out.println(a[cnt]);
        
        
    }
    
}
