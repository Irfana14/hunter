/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeated;
import java.util.*;
/**
 *
 * @author akil
 */
public class REPEATED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> obj=new ArrayList<Integer>();
        ArrayList<Integer> obj2=new ArrayList<Integer>();
        int n= scan.nextInt();
        int [] a= new int[n];
        int [] b=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        //Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            obj.add(a[i]);
        }
        
        int cnt=0;
        for(int i=1;i<100000;i++)
        {
            
         int f= Collections.frequency(obj,i);
         
         if(f>1)
         {
             obj2.add(i);
             
         }
         
         
        }
        
        for(Integer doo:obj2)
        {
            System.out.println(doo);
        }
        
        
        
    }
    
}
