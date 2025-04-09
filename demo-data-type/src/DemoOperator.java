public class DemoOperator {
  public static void main(String[] args) {
    
    // + 1
    int x = 3;
    // 加減數都有四種寫法
    // x = x + 1;
    // x += 1;
    // x++;
    // ++x;

    System.out.println("x = " + x);

    // -1 
    int y = 5;
    y = y - 1;
    y -= 1;
    y--;
    --y;
    System.out.println("y = " + y);

    // + or - non 1 number
    int z = 10;
    z = z + 2;
    z += 2;
    z = z - 3;
    z -= 3;
    System.out.println("z = " + z); //8


    // ! * or /
    int a = 6;
    a = a * 2;
    a *= 2;
    a = a / 3;
    a /= 2;
    System.out.println("a = " + a );

    // Count number of even number between 0 - 9
    int counter = 0;

    for (int i = 0; i < 9 ; i++){
      if (i %2 != 1){
        counter++;
      }
    }
    System.out.println("The number of even number between 0 - 9 = " + counter);



    //Larger number
    int num1 = 10;
    int num2 = 12;
    //12

    if (num1 > num2) {
      System.out.println("The larger one is "+ num1);
    } else {
      System.out.println("The larger one is "+ num2);
    }


    int num3 = 13;
    int max = 0;
    if (num1 > num2) {
      max = num1;
    } else {
      max = num2;
    } System.out.println("the larger number will be = " + max);
    if ( max < num3 ) {
      max = num3;
    } System.out.println("the larger number will be = " + max);








    };
    



  }
  

