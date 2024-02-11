// This is about "Switch Statements"

public class Switch {
    public static void main(String[] args) {
        // Instead of writing many "if..else" statements, we can use switch statement.
        // The "switch statement selects one of many code blocks" to be executed :

        /*  Syntax :- Switch Expression

            switch(expression) {
                            case x:
                                // code block
                                break;
                            case y:
                                // code block
                                break;
                            default:
                                // code block
            }
            Working of Switch Statement :-  1.  The "switch" expression is evaluated once.
                                            2.  The Value of the expression is compared with the values of each "case".
                                            3.  If there is a match, the associated block of code is executed.
                                            4.  The "break" and "default" keywords are optional, will be described later in this section.
        */

        int day = 5;
        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 : 
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Not in the Week");
                break;
        }

        /*  "Break" Keyword :-  When java raeches a break keyword, it breaks out of the switch block.
                                This will stop the execution of more code and case testing inside the block.
                                When a match is found, and the job is done, its time for a break. There is no need for testing.
                    Note    :-  A break can save a lot of execution time because it "ignores" the execution of 
                                all the rest of the code in the switch block.
            Default :-  The 'default' keyword specifies some code to run if there is no case match.
                        Below is the Illustration :-
        */                       
        
        int month = 1;
        switch (month) {
            case 4:
                System.out.println("April");
                break;
        
            default:
                System.out.println("Looking for Another Cases.");
                break;
        }
        

    }
    
}
