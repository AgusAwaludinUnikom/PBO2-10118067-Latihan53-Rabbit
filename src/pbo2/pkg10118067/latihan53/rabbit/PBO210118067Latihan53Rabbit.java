/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan53.rabbit;

/**
 *
 * @author
 * NAMA : Agus Awaludin
 * NIM : 10118067
 * KELAS : PBO2
 * Latihan ini berisi tentang cara menampilkan data hewan dengan metode
 * polymorpism
 */
public class PBO210118067Latihan53Rabbit {

    private static String name;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        name = rabbit.getName();
        
        System.out.println("Hello, His name is " + name );
        System.out.println(name + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(name + " eats " + rabbit.eats);
        System.out.println(name + " has " + rabbit.noOfLegs + " legs.");
        System.out.println(name + " color is " + rabbit.getColor());
        
    }
    
}
