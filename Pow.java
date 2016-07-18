/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pow;

/**
 *
 * @author Student
 */
public class Pow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=2,power=3,i,pow=1;
        for(i=1;i<=power;i++)
        {
            pow*=n;
        }
        System.out.println("the power of the no. is"+pow);
     
    }
    }

