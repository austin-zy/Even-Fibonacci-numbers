/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even.fibonacci.numbers;

/**
 *
 * @author Austin
 */
public class EvenFibonacciNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1;
        int fib = 2;
        while(fib<89){
            int temp = fib;
            fib = x+fib;
            x=temp;
            System.out.print(fib+", ");
        }
    }
    
}
