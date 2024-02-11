// "Recursion" in Java

public class Recursion {
    public static void main(String[] args) {
        
        /*  Java Recursion  :-  Recursion is the "technique" of making a "function call itself".
                                This technique provides a way to break complicated problems down into simple problems
                                which are easier to solve.

                                Illustration with Examples :-
        */

        // Use recursion to add all of the numbers up to 10,

        System.out.println(sum(10));


    }

    public static int sum (int k){
        if (k > 0){
            return k + sum(k - 1);
        }
        else{
            return 0;
        }
    }



    // Explanation :- When the sum() function is called, it adds parameter 'k' to the sum of all numbers smaller than
    //                'k' and returns the result. When 'k' becomes 0, the function just returns 0. 
    //                When running, the program follows these steps:

    /*  10 + sum(9)
        10 + (9 + sum(8))
        10 +(9 + (8 + sum(7)))
        ...
        10 + 9 + ... + 1 + sum(0)
        10 + 9 + ... + 1 + 0
        
        Since the function does not call itself when 'k' is 0, the program stops there and returns the result.
        
        "HALTING CONDITION" :-  In recursion, if function would not stop calling itself, then it will move infinitely,
                                But if it have to stop at given condition, then " the point where function / method 
                                stop calling itself " then this is known as halting condition.
    */


}
