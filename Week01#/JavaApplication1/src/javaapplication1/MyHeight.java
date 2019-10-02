/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author swmichalak
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int centimetres=10;
        double feet=0;
        double inches=0;
        
        inches= centimetres /2.54;
        feet = inches /12;
        feet = feet % 12;
        System.out.println(centimetres + " cm is " + inches +" in inches and " +
                feet + " in feet");
    }
    
}
