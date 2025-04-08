public class DemoString {
  public static void main (String[] args) {
    char c1 = 'H';
    // String is not a primitive 
    String s1 = "Hello";
    String s2 = "100";
    String s3 = "omg,";
    String s4 = " sun ";
    String s5 = "beach ";
    String s6 = "of ";
    String s7 = " you";

    //String + operation
    s2 = s2 + "100";
    System.out.println(s2); //"100100" 
    s1 = s1 + "100";
    System.out.println(s1); // "hello100"
    s1 = s1 + "100";
    System.out.println(s1); // "hello100"
    s5 = s3 + s7 + s4 + s6 + s5;
    System.out.println(s5);



  }
  
}
