/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab1.pkg2;

/**
 *
 * @author Admin
 */
public class b51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int number = 4;
        long factorial = 1;
        for(int i=1;i<=number;i++){
        factorial*=i;
        }
        System.out.println("The factorial of "+number+ " is "+factorial);
    }
}
