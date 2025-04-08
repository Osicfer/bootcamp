public class DemoDouble {

  public static void main(String[] args)  {
    int x = 9;

    //Store a number with decimal places
    //Type: double
    double y = 9.9;
    System.out.println(y); //9.9

    //! can't store d.p. into interger variable
    // x = 9.9

    // Store 99.9 into variable price
    // Store 3 into variable quantity
    // calculate checkout amount
    double price = 99.9;
    int quantity = 3;
    double amount = price * quantity;
    System.out.println(amount);

    // ! problem for "double"
    double o1 = 0.1 + 0.2;
    System.out.println(o1);


    // 10 -> int value
    // 3 -> int value
    // ! int / int -> int
    // 10 / 3 -> 3
    // assin result into w (3 -> 3.0)
    double w = 10 / 3;
    System.out.println(w); // 3.0

    int score1 = 71;
    int score2 = 82;
    // calculate the average score

    double average = (score1 + score2) / 2.0;
    System.out.println(average);
    

    // diviede by zero
//    double r3 = 10 / 0;
//    System.out.println(r3);
    double r4 = 0 / 10;
    System.out.println(r4);









  }
}