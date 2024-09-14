/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab1.pkg2;

/**
 *
 * @author Admin
 */
public class b48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int count=0;
        for(int i=33;i<=97;i++){
        if(i % 7==0){
        count+=i;
            }
        }
        System.out.println("There are "+count+" multiples of 7 between 33 and 97");
    }
}
