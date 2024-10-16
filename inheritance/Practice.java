// public class Practice
// {
//     public static void main(String a[]){
//         AdvCalc obj = new AdvCalc();
//         //create object of sub class

//         int r1 = obj.add(4,5);
//         int r2 = obj.sub(6,5);
//         int r3 = obj.mul(2,5);
//         int r4 = obj.div(10,5);

//         System.out.println(r1);
//         System.out.println(r2);
//         System.out.println(r3);
//         System.out.println(r4);
//     }
// }

//************* Need of inheritance:
//let's say the simple calc is already built.
//client came to you and said hey i want to add some feature to calc like SIN , COS, Square, Cube
// so there is a way you can add new methods to Calc class or you can create a another class AdvCalc copy all basic feature from Calc class and add into it then create new methods for new feature.

//If you notice there is code redundancy.
//so you can create anothere class called AdvCal and extends the Calc methods into AdvCal class which is called inheritance.


// Single level inheritance:
// public class Practice
// {
//     public static void main(String a[]){
//         AdvCalc obj = new AdvCalc();
//         //create object of sub class

//         int r1 = obj.add(4,5);
//         int r2 = obj.sub(6,5);
//         int r3 = obj.mul(2,5);
//         int r4 = obj.div(10,5);

//         System.out.println(r1);
//         System.out.println(r2);
//         System.out.println(r3);
//         System.out.println(r4);
//     }
// }

// ************* Multilevel inheritance:
// public class Practice
// {
//     public static void main(String a[]){
//         VeryAdvCalc obj = new VeryAdvCalc();
//         //create object of sub class

//         int r1 = obj.add(4,5);
//         int r2 = obj.sub(6,5);
//         int r3 = obj.mul(2,5);
//         int r4 = obj.div(10,5);
//         double r5 = obj.power(4,2);

//         System.out.println(r1);
//         System.out.println(r2);
//         System.out.println(r3);
//         System.out.println(r4);
//         System.out.println(r5);
//     }
// }


// ************* Multiple inheritance 
//java does not support multiple inheritance

//ex - 1 - multilevel inheritance
//    class A  - x()
//     |
//    class B  - y()
//     |
//    class C  - z()
//so here class C object can get z,y,x methods

//ex - 2 - multiple inheritance
//    class A  - x(),a()     class B  - y(),a()
//     |                   |
  
//                  |
//              class C  - x() - ok, y - ok , a() ?ambiguity(confuse)
//so here class C object can get x() and y() but when try to access a() method will get confuse ?
//that's the rease java does not support multiple inheritance


//************* this and super method inside constructor -
//Note - every class in java extends the Object class. like class A extends Object{}
// class A{
//     //default constructor
//     public A(){
//         super();
//         System.out.println("In A");
//     }
//     //parameterized constructor
//     public A(int n){
//         super();
//         System.out.println("In A int");
//     }
// }

// class B extends A{
//     public B(){
//         //by default every constructor super() method is there even if you do not mention.
//         super();
//         System.out.println("In B");
//     }
//     //parameterized constructor
//     public B(int n){
//         // super();// means call the constructor of super class i.e default one ->"In A".
        
//         // if you want to call parameterized constructor pass parameter into super method.. as below
//         // super(n);// output - In A int, In B int.

//         //this method will execute the constructor of same class i.e -> In B
//         this();// output - In A, In B, In B int
//         System.out.println("In B int");
//     }
// }

// public class Practice{
//     public static void main(String a[]){
//         // B obj = new B(); // default contructors called - In A, In B
//         B obj = new B(5); // default contructors called - In A, In B int
//     }
// }


//************* Method overriding */
// class Calculator{
//     public int add(int n1, int n2){
//         return n1 + n2;
//     }
// }

// class AdvCaculator extends Calc{
//     //same name method as parent class.
//     public int add(int n1,int n2){
//         return n1 + n2 + 1;
//     }
// }

// public class Practice{
//     public static void main(String a[]){
//         AdvCaculator obj = new AdvCaculator();
//         int r1 = obj.add(3,5);
//         System.out.println(r1);
//     }
// }

//********** packages */
//in java we can create folder structure and import 
//like import tools.Calc
//need to understand more.

// import tools.AdvCalc;
import tools.*; // can access all files inside tools
//let's say tools has one more folder called basicTools - you can import as below
//import tools.basicTools.fileName;

// public class Practice{
//     public static void main(String a[]){
//         AdvCalc obj = new AdvCalc();
//         int result = obj.mul(10,10);
//         Calc obj1 = new Calc();
//         int result1 = obj1.add(10,5);
//         System.err.println(result);//100
//         System.err.println(result1);//15
//     }
// }


//******************* Access modifiers */
//                                  public      private     default     protected
//same class -                      yes         yes         yes         yes
//same package, sub class -         yes         no          yes         yes
//same package, non-subclass -      yes         no          yes         yes
//different package, subclass -     yes         no          no          yes
//differernt package , non-subclass-yes         no          no          no


// Polymorphism - poly means many and morphism means behaviour
//there are two types of polymorphism 
//1.compiletime - 
//Ex - overloading add(int a, int b), add(int a, int b, int c);
//2. runtime
//Ex - overriding 
//class A have add(int x,int y)
//calss B extends A and have add(int x, int y) 
//it will decide which method will execute at run time.


//Dynamic method dispatch
// class A{
//     public static void show(){
//         System.out.println("In A Show");
//     }
// }

// class B extends A{
//     public static void show(){
//         System.out.println("In B Show");
//     }
// }

// public class Practice{
//     public static void main(String a[]){
//         B obj = new B();
//         obj.show(); // In A Show

//         A obj1 = new B();
//         obj1.show(); // In A Show //reference of A but object is B because A is parent and b is child.

//         //if B also have same method Show then above result will be 
//         // In B Show
//         // In A Show
//     }
// }

//**************** final keyword */

//final keyword simply means const, once you define varible , yoou can't change.
//can use with variable, method, class

//class wiht final keyword
//if you don't want to allow access class use final keyword

// final class A{
//     public void show(){
//         System.out.println("In A Show");
//     }
// }

//hence error when you inherite class A -> The type B cannot subclass the final class A
// class B extends A{
    
// }

//method with final keyword 
//when you don't want to override a method after inherite.
// class A{
//     public final void show(){
//         System.out.println("In A Show");
//     }
// }

// class B extends A{
//     public void show(){// error-> Cannot override the final method from A
//         System.out.println("In B Show");
//     }
// }

// public class Practice{

//     public static void main(String a[]){
//         //variable final
//         final int num = 8;
//         // num = 9; // cannot assign a value to final variable num
//         System.out.println(num);//8

//         A obj = new A();
//         obj.show();//In A Show

//         B obj1 = new B(); 
//         obj1.show();


//     }

// }

//****************** Object class equals to string hashcode */
//Do you remember when we were discussing inheritance.
//there a super class for every class even if we don't extends but java will provide that.
// and that object have it's own methods/
//Ex
// class A{
//     String model;
//     int price;

// }
// class Practice{
//     public static void main(String a[]){
//         A obj = new A();
//         obj.model = "New Modal";
//         System.out.println(obj);//A@7a81197d 
//         System.out.println(obj.toString());//A@7a81197d 
//         //Reason for above output is obj have many default methods like toString(),equals() 
//         //and toString() method converts into heshcode
//         //if you create method with same name defaul will override(current method output will come).
//     }
// }

//************* Typecasting, Downcasting, Upcasting */
public class Practice{
    public static void main(String a[]){
        double d = 4.5;
        // int i = d;// error -> Type mismatch: cannot convert from double to int
        System.out.println(d);//4.5
        int i = (int) d;
        System.out.println(i);//4 // here loose .5 because of typecasting
    }
}

// need to understand more Downcasting and Upcasting.