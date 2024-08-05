class Hello{

public static void main(String a[]){

    //variabls
    int num1 = 5;
    int num2 = 4;
    int result = num1 + num2;

    //data types
    int num = 9;
    byte by = 127;
    short sh =556;
    long l = 584l;
    float f=5.8f;
    double d = 5.8;
    char c = 'k';
    // boolean b = true;



    //Literals:
    //A notation that representes a fixed value in the source code and it can be anything integer ,float , double, string, long.. etc

    int count = 0;
    //A literal ‘0’ represents the value zero.


//Type ccoversion and casting:
int digit = 12;
//byte b = digit;//Hello.java:31: error: incompatible types: possible lossy conversion from int to byte

byte b = (byte)digit;//12


System.out.print(b);
}
}