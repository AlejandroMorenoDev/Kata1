/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author amct2
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Alejandro", new Date(97,6,5));
        System.out.println(p1.getName() + " tiene: " + p1.getAge() + " años");
    }
    
}
