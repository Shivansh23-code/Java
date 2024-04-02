/*   WHILE LOOP     */

public class loop {
    public static void main(String[] args){
        // While Loop

        /*  Loops   :-  Loops can execute a block of code as long as a specified condition is reached.
                        These are handy because they save time, reduce errors, and they make code more readable.    

            Java While Class :- The "while" :oop loops through a block of code as long as a specified condition is "true".
            
            Syntax :- while(condition){
                // Code to be executed
            }

            Illustrations :-
        */

        // int i = 0;
        // while(i < 5){
        //     System.out.println(i);
        //     i++;    // This is must to be used in while loop for given variable
        // }

        // Note :- Do not forget to increase the variable used in the condition, otherwise the loop will never end !

        /*  The "Do/While loop" :-  This loop is the variant of the "while" loop. This loop will execute the code block
                                    once, befre checking if the condition is true, then it will repeat the loop as long
                                    as the condition is true.
                        Syntax  :-  do{
                                    // The code to be executed
                                    }
                                    while (condition);

                        Note :- This loop will execute at least once for any condition whether is true or false,
                                doesn't matter.
                    
        */

        // int i1 = 0;
        // System.out.println("\n");
        // do {
        //     System.out.println(i1);
        //     i1++;
        // } while (i1<5);

// ------------------------------------------   JAVA FOR LOOP   --------------------------------------------------

        /*  Java "For Loop" :-  When we know how many times you wan tto loop through a block of code, 
                                then we can use the "for" loop instead of a "while loop" :

                    Syntax  :-  for(statement 1; statement 2; statement 3){
                                // Code block to be executed
                                }

                        where,
                                Statement 1 :-  is executed (one time) before the execution of the code block.
                                Statement 2 :-  defines the condition for executing the code block, if condition is true 
                                                then only it will execuetd otherwise it will not execuetd.
                                Statement 3 :-  is executed (every time) after the code block has been executed.
        */

        // for printing number from 0 to 4
        // for(int i2 = 0; i2 < 5; i2++){
        //     System.out.println(i2);
        // }

        System.out.println("\n");

        // for printingthe even values between 0 to 10
        for (int j = 0; j <= 10; j = j+1) {
            if (j % 2 != 0) {
                System.out.println(j + " ");
            }
            // System.out.println(j);
        }

        /*      Nested Loops :- It is also possible to place a loop inside another loop. This is called a "nested loop".
                        The "inner loop" will be "executed one time for each iteration" of the "outer loop" :
        */

        // Outer Loop :-
        for (int I = 1; I <= 2; I++){
            System.out.println("Outer : " + I); // Executes 2 Times

            // Inner Loop
            for (int j1 = 1; j1 <= 3; j1++){
                System.out.println(" Inner : " + j1);    // Execute 6 Times (2 * 3)
            }
        }
        
        /*  Java "For Each Loop" :- There is also a "for-each" loop, which is used exclusively to loop through elements
                                    in an "array" :

                        Syntax  :-  for (type variableName  :  arrayName) {
                                        // code to be executed
                                    }
        */

        // Printing all elements in array, using a "for - each" loop :

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }

        /* JAVA Break   :-  We have also used this in "Switch" statement, now "in loops" it can be "used to jump out". 
           JAVA Continue :- The "continue" statement breaks one iteration (in the loop), if a specified condition
                            occurs, and continues with the next iteration in the loop.
        */

        // "Break" statement in "For Loop"

        System.out.println("\n");

        for (int k = 1; k < 5; k++){
            if (k == 3){
                break;
            }
            System.out.println(k);
        }

        // "Continue" statement "For Loop"

        System.out.println("\n");

        for (int k = 1; k < 6; k++){
            if (k == 4) {
                continue;               
            }
            System.out.println(k);
        }

        // "Break" statement in "while loop"

        System.out.println("\n");

        int k1 = 0;
        while (k1 < 5) {
            System.out.println(k1);
            k1++;
            if (k1 == 3) {
                break;
            }
        }

        // "Continue" statement in "while loop"

        System.out.println("\n");

        int k2 = 0;
        while (k2 < 5) {
            
            if (k2 == 2) {
                continue;
            }
            System.out.println(k1);
            k1++;
            



        }



    }    
}
