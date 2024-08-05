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

// byte b = (byte)digit;//12


//Arithmatic operators
int numA =3;
int numB =4;
//int add = numA +numB; //7
int add = numA -numB; //-1

System.out.print(add);

//numA = numA +1;//4
//numA += 1; //4
// numA++; //4 post - increment
// ++numA; //4 pre - increment

// int newResult = numA++; // 3 fetch the value and then increment.

// int newResult = ++numA; //4 increment and then fetch the value


// boolean newResult = numA < numB; // true
// boolean newResult = numA > numB; // false
// boolean newResult = numA >= numB; // false
// boolean newResult = numA <= numB; // true
// boolean newResult = numA == numB; // false
// boolean newResult = numA != numB; // true



//Logical operator(AND &&, OR ||, NOT !)
// boolean newResult = numA > numB && num1 < num2; //false 
// boolean newResult = numA > numB || num1 < num2; //false 

// Not !
// System.out.print(!newResult); //true



//conditional statement
//if else
if(num1 > num2) //5 > 4
System.out.print("hello"); // ans
else
System.out.print("bye");

int num3 = 12;
if(num1<num2){
System.out.print(num1);
}else if(num2 > num3){
    System.out.print(num2);
}else{
    System.out.print(num3);
}


}
}