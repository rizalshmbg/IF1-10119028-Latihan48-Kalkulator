/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan48.kalkulator;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program kalklator
 */
public class IF110119028Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);
        double value1 = kalkulator.getValue1();
        double value2 = kalkulator.getValue2();
        System.out.println("VALUE 1 = " + value1);
        System.out.println("VALUE 2 = " + value2);
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        double add = kalkulator.add(value1, value2);
        double minus = kalkulator.minus(value1, value2);
        double multiplication = kalkulator.multiplication(value1, value2);
        double division = kalkulator.division(value1, value2);
        System.out.println("Result Add is = " + add);
        System.out.println("Result Minus is = " + minus);
        System.out.println("Result Multiple is = " + multiplication);
        System.out.println("Result Division is = " + division);
    }
    
}
