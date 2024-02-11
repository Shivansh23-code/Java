// ARRAYS in JAVA

public class Arrays {
    public static void main(String[] args) {
        /*  Java Arrays :-  are used to store multiple values in a single vaariable, instead of declaring separate 
                            variables for each value.

                            "To Declare an array", we have to define the "variable type" with "Square Brackets []". 
                Syntax : -  " <Data Type> []  <Array Names>; "
                            " To initialize array, We have following syntax "
                Syntax :-   " <data type> [] <Array Name> = { <values> } ; "
        */                  

        String [] First = {"Ram", "Lakshman", "Bharat", "Shatruhan"} ;

        // System.out.println(First[3]);   // To access a Particular Element for a given index value 3
        // // Or

        // // Printing Arrays Using For Each Loop

        // for (String i : First){
        //     System.out.println(i);
        // }
        
        int [] a = {1,2,3,4,5};

        // System.out.println(a[4]);   //  To access an element at index value 4
        // for(int j : a){
        //     System.out.println(j);
        // }

        // CHANGING THE PARTICULAR ELEMENT IN ARRAY
        First[0] = "Shri Ram" ;
        a [4]   =   23 ;
        System.out.println(First[0]);
        System.out.println(a[4]);

        // TO FIND THE LENGTH OF AN ARRAY
        System.out.println(First.length);   // Using "Length" method to print array length
        System.out.println(a.length);

        /*  Loop Through An Array :- We can loop through the arary elements with the "for" loop, and use the "length" property 
                                     to specify how many times the loop should run. 
        */

        // To print all elements in First [] array, Using for loop

        for(int k = 0; k < First.length; k++){
            System.out.println(First[k]);
        }

        /*  Multi - Dimensional Arrays :- This is an array of arrays.
                                          These are useful when we want to store data as a tabular form,
                                          like a table with rows and columns.
            To create a "two-dimensional array", "add each array" within its "own set of Curly braces" '{}' :
        */

        int [][] myNumbers = {{1,2,3,4}, {5,6,7}} ;

        // Now myNumbers is an array with two arrays as its elements.
        // Printing specific element using index

        System.out.println(myNumbers[1][2]);    //  indexing in arrays always starts with '0'.

        // Changing Element Values

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);  // This will print output 9 instead of 7

        /*  Loop Through a Multi-Dimensional Array :- We can also use a "for loop" inside another "for loop",
            to get the elements of a two-dimensional array (still we have to point to the two indexes) :
         */

        //  Printing myNumbers

        for(int m = 0; m < myNumbers.length; ++m){
            for(int n = 0; n <myNumbers[m].length; ++n){
                System.out.println(myNumbers[m][n]);
            }
        }





    } 
}
