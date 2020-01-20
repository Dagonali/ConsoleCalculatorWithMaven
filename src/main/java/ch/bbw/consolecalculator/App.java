package ch.bbw.consolecalculator;

import java.sql.SQLOutput;

/**
 * @author Ali Da Silva Ouederni
 * @version Jan. 20
 *
 */

public class App 
{
    public static void main( String[] args ) {

        Calculator calculator = new Calculator();
        int valueA = 10;
        int valueB = 20;

        System.out.println("Conosle Calculator");
        System.out.println("==================\n");

        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
        System.out.println("Subtraktion " + valueA + " - " + valueB + " = " + calculator.differenz(valueA, valueB));
        System.out.println("Division " + valueA + " / " + valueB + " = " + calculator.quotient(valueA, valueB));
    }
}
