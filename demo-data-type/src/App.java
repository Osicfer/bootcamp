public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");

        // define varible y to stre an integer value 100
        int y = 100;
        System.out.println(y);


        //Re-assignment
        y = 200;
        System.out.println(y);


        // can't re-define varible data type 
        // ! only define the type of varible once
        // int y = integer then y can only storage integer in this varible
        // int y = 200;
        // + - * /
        int a = 1 + 2;
        System.out.println(a); //3

        // from right to left
        // Assign the result of "y + 2" into y.
        //1. y + 2 = 202
        //2. Assign 202 to y
        y = y + 2;
        System.out.println(y); //202

        //- *
        // Define variable b store 99
        // b - 200, put the result into q
        // print out q
        //q x 10, put the result into q again
        //print out q

        int b = 99;
        int q = b - 200;
        System.out.println(q);

        int vincentsalary = 180000 * 12;
        System.out.println(vincentsalary);
        q = q * 10;
        System.out.println(q);


        // ! Put 2.5 into an interger variable -> trim decimal place (Java)
        int r2 = 5 / 2;
        System.out.println(r2); //r2 = 2.5 -> 2

        // ! Put ~3.333333 into an interger variable -> trim decimal places (Java)
        r2 = 10 / 3;
        
    }
}
