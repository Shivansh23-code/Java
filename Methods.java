//  In this section we will learn about the "Methods"

public class Methods {
    
        // A "method" is block of code which only runs when it is called.
        // We can pass data, known as parameters, into a method.
        // Methods are used to perform certain actions, and they are also known as "functions".

        /*  Create a Method :-  "A method must be declared within a class".
                                It is defined with "the name of the method, followed by parentheses ()".
                                Java provides some pre-defined methods, such as "System.ou.println()",
                                but we can also create our own methods to perform certain actions :
                    To Create a method inside a main(), we have following syntax :
                        "static void <method_name>(){
                            // code to be executed
                        }"
        */

        static void add(){
            // code to be executed
        }
        // "add" is the name of the method
        // "static" means that the method belongs to the Main class and not an object of the main class.
        // "void" means it doesnot have any return value.

        /*  Call a Method :- To call a method in java, write the method's name followed by two parenthesis () and a semicolon ;
                             In the following example, myMethod() is used to print a text (the action), 
                             when it is called :                   
        */              

        static void myMethod(){
            System.out.println("I just got Executed!");
        }
        public static void main(String[] args) {
            add();
            myMethod();

            // We can call any method multiple times by writing simple its name with followed by () in main function
            myMethod();
            myMethod();myMethod(); 
        }


    
}
