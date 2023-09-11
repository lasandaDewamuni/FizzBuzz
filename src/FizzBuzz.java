/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    /* Notes about Java syntax:
     *  - all conditions are in parentheses
     *  - all lines of code end with ;
     *  - name of data type is written when declaring a variable
     *  - instead of elif it is else if
     *  - instead of 'and' double ampersand (&&) is used for the and operator
     */
    public static void main(String[] args) {
        /* FOR LOOP IMPLEMENTATION:
        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        } */
        // TASK 1.1: REWRITE THIS USING WHILE
        int i = 1;
        while (i < 100){

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy5 && divisibleBy3) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

        i++;
        return i;
    }
}
