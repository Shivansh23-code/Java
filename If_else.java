// This Section is AllAbout" If-Else Statement"

public class If_else {
    public static void main(String[] args){

        // Java has the following conditional statements :
        /*
            1. Use "if" to specify a block of code to be executed, if a "specified condition is true".
            2. Use "else" to specify a block of code to be executed, if the "same condition is false".
            3. Use "else-if" to specify a new condition to test, if the "first condition is false".
            4. Use "switch" to specify "many alternative blocks" of code "to be executed".
        */

        int a = 10, b = 18;

        // The "If" Statement
        if (a < b) {
            // This block executed when our condition is true
            System.out.println(a + " is less than " + b);
        }

        // The "Else" Statement
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
        else{
            // This is executed only when if conditon is false
            System.out.println(a + " is not equal to " + b);
        }

        // "Else-if" Statement
        int x = 23, y = 25, z = 78;
        if (x <= 10) {
            System.out.println("Our condition is Satisfied");
        }
        else if (x > y) {
            System.out.println("Yes " + x + " is " + "greater than " + y);
        }
        else{
            System.out.println("Else Statement is Executed");
        }

        // Short Hand "If...Else"
        /*  There is also a "short-hand" if- else, which is known as the " Ternary Operator " because it consist of three operands
            Note :- It can be used to replace multiple lines of code with a single line, and is most often used to replace simple
            if elsse statements :-
                "variable"  =   "(condition)" ?   "expressionTrue"   :    "expressionFalse";
        */

        String result = (z == 78) ? "Our Expression is True" : "Our Expression is False";
        System.out.println(result);
    }
}
