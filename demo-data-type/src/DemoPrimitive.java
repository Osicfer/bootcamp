public class DemoPrimitive {
  public static void main (String[] args) {
    // ! Primitives (int, double, long, short, byte, float, boolean, char)
    // 8 primitives in total for Java

    // Primitives for Integer (byte, short, int, long)
    int x = 10;

    // range from -128 to 127
    byte b1 = 10;
    byte b2 = -128;
    byte b3 = 127;
    //byte b4 = 128;
    // byte b4 = 128;
    System.out.println(b1);
    

    // -32xxx to 32xxx
    short s1 = 10;
    short s2 = -32768;
    short s3 = 32767;
//    short s4 = 32768;
    System.out.println(s1);


    // int  (2.1 b)
    int x1 = 1_000_000;
    int x2 = 1_000_000_000;
    int x3 = -2147483648;
//    int x4 = -2147483649;
    int x5 = 2147483647;
    System.out.println(x5);


    // long
    // 10 is a int value
    // Assign int value to long value(NOT OK)
    // ! -2147483649 -> illegal int value
    // ! -2147483649 + L -> -2147483649L -> legal long value
    long l1 = 10;
    long l2 = -2147483649L;
    System.out.println(l2);

    // long + int -> long
    l1 = l1 + 100;
    System.out.println(l1);

    x3 = x3 - 1;
    System.out.println(x3);
    x2 = x2 - 1;
    System.out.println(x2);
    x5 = x5 + 31;
    System.out.println(x5);


    // b3 + 1
    //b3 = b3 + 1;
    // byte + int -> int
    // assign int to byte variable
    //System.out.println(b3);


    int i9 = 1;
    b3 = (byte) (b3 + i9); //force assigment from int to byte
    System.out.println(b3);

    int i10 = 1;
    byte b4 = 1;
    // byte + int -> int
    // assign int to byte (JAVA: unsafe -> not allow for assigment)
    b4 = (byte) (b4+i10);
    System.out.println(b4); //2
    

    // double, float
    // !9.5 is a double value
    // !9.5d is a double value
    // !9.5f is a float value
    double d1 = 9.5;
    double d2 = 9.5d;
    double d3 = 9.5D;
    float f1 = (float)9.5;
    float f2 = 9.5f;


    //! the type double is more precise than float.
    // float f2 = 9.5;
    float f3 = 0.3f - 0.1f;
    System.out.println(f3);


    // boolean
    boolean b10 = true;
    b10 = false;
    System.out.println(b10);

    int age = 66;
    boolean isEldery = age > 65;
    System.out.println(isEldery);

    // char
    // Store single character
    char c1 = 'a';
    // can't store more than single charater
    //!can't make it to be -> char c1 = 'au' 
    char c2 = 'b';
    char c3 = 'c';
    char c4 = 'i';
    char c5 = 't';
    char c6 = 'h';
    System.out.println(c2);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c3);
    System.out.println(c6);




  }

}