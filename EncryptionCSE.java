/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptioncse;

/**
 *
 * @author Dhaarani
 */
public class EncryptionCSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int[] a={3,-4,6,2,-6,3};
        int sum=0;
      
        int j=a.length;
          int b=j;
        int []n=new int[b];
        n[b-1]=a[j-1];
        System.out.println(n[b-1]);
        for(int i=b-1;i>0;i--)
        {
            n[b-2]=n[b-1]-a[j-2];
            sum=sum+n[b-1];
            System.out.println(n[b-2]);
            b--; 
            j--;
            
        }  
           System.out.println(sum+n[b-1]);     
    }
    
}
  