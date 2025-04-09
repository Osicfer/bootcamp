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



    // String + int -> String (setp 1)
    //Assign String value to String variable (Step 2)
    String s10 = "hello" + 13;
    System.out.println(s10);

    //String + boolean -> String
    s10 = s10 + true ;
    System.out.println(s10);

    // !squals() -> String method tools
    //!Primitive has no tools (value storage ONLY)
    // String is not a primitive. So String can store value and has tool
    String s11 = "hello";
    s11.equals("hello");
    System.out.println(s11.equals("hello"));//true. asking if s10 equals to "hello"
    System.out.println(s11.equals("male"));//false, asking if s11 equals to "male"

    System.out.println(1 + 1); // 2
    int r2 = 1 + 1;

    boolean result = s11.equals("hello");
    System.out.println(result);//true

    // String method 2: length()
    // 參數 = parameter
    // length() has no pararmeters
    System.out.println(s11.length());//5
    int s11Length = s11.length();
    System.out.println(s11Length);

    double d1 = s11.length();
    //short s10 = s11.length();

    // ! String Method 3: charAt()
    // 1 is an index. which always start with 0
    System.out.println(s11.charAt(1)); //e
    System.out.println(s11.charAt(0)); //h

    System.out.println(s11.indexOf('o'));


  }
  
}
