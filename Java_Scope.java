// In this section we will look into "Scope of variables" in java

public class Java_Scope {
    public static void main(String[] args) {
     
        //  Java Scope :- In java, Variables are only accessible inside the region they are created. This is called "Scope".
        /*  Method Scope :- Variables declared directly inside a method are available anywhere in the method following 
                            the line of code in which they were declared :
        */

        // "Code Here CANNOT use x"
        int x = 100;

        // "code here can use x"
        System.out.println(x);

        /*  Block Scope :-  A Block of code refers to all of the code between curly braces {}
                            Variables declared inside blocks of code are only accessible by the code
                            between the curly braces, which follows the line in which the variable was declared :
        */

        // Code here cannot use for block scope
        {
            // This is a block

            // code here CANNOT use m

            int m = 45;
            // Code here CAN use m
            System.out.println(m);
        }
        // The block ends here

        // code here cannot use m 


        /*
            A block of code may exist on its own or it can belong to an 'if', 'while' or 'for' statement. 
            In the case of 'for statements', "variables declared in the statement itself are also available 
            inside the block's scope".
        */

    }
}
