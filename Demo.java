// // class and objects.

// class Calculator{
//     int a; //variable
//     public int add(int n1, int n2){ //method
//         int r = n1 + n2;
//         return r;
//     }
// }

// public class Demo{
// public static void main(String a[]){
//     int num1 = 4;
//     int num2 = 5;

//     Calculator calc = new Calculator();// instance, 
//     //calc is a variable.

//     int result = calc.add(num1, num2);

//     System.out.println(result);//9
// }
// }


//Methods-
// class Computer{

//     public void playMusic(){
//      System.out.println("Music playing...");

//     }
//     public String bugAPen(int cost){
//         return "Pen";
//     }
    
// }

// public class Demo{
// public static void main(String a[]){
//     Computer obj  = new Computer();
//     obj.playMusic();//music playing
//     String str = obj.bugAPen(10);
//     System.out.println(str);//pen
// }
// }


// Method overloading

// class Calculator{
  
//     public int add(int n1, int n2){ //method
//         int r = n1 + n2;
//         return r;
//     }
//     // public double add(double n1, int n2){ //method
//     //     int r = n1 + n2;
//     //     return r;
//     // }
//     public int add(int n1, int n2, int n3){ //method
//         int r = n1 + n2+ n3;
//         return r;
//     }
// }

// public class Demo{
// public static void main(String a[]){
//     int num1 = 4;
//     int num2 = 5;
//     int num3 = 6;

//     Calculator calc = new Calculator();// instance, 
//     //calc is a variable.

//     int result = calc.add(num1, num2);
//     // double result1 = calc.add(1.0, num3);
//     int result2 = calc.add(num1, num2,num3);

//     System.out.println(result);//9
//     System.out.println(result2);//15
// }
// }

// Array - collection of variable values

// public class Demo
// {
//     public static void main(String a[])
//     {
//         int nums[] = {3,7,2,4};
//         System.out.println(nums[1]); //7

//         // change value
//         nums[1] = 6;
//         System.out.println(nums[1]); //6

//         //to print all values
//         for(int i = 0; i < 4; i++){
//         System.out.println(nums[i]); // 3,6,2,4

//         }

//     }
// }


//Multi-dimensional array.

// public class Demo
// {
//     public static void main(String a[])
//     {
//             int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//             for (int i = 0; i < myNumbers.length; ++i) {
//                 for (int j = 0; j < myNumbers[i].length; ++j) {
//                      System.out.print(myNumbers[i][j] +" ");
//                 }
//                  System.out.println();
//             }
//     }
// }

// Jagged array also known as ragged array.
// They are the arrays containing arrays of different length.

// public class Demo
// {
//     public static void main(String a[])
//     {
//        int[][] jaggedArray =  new int[3][];
//        jaggedArray[0]  = new int[]{0,1,2,3};
//        jaggedArray[1]  = new int[]{4,5};
//        jaggedArray[2]  = new int[]{6,7,8};

//        for(int[] row: jaggedArray){
//         // System.out.println(Arrays.toString(row));
//        }
//     }
// }

//Array of objects
// class Student
// {
//     int rollno;
//     String name;
//     int marks;    
// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//        Student s1 = new Student();
//         s1.rollno = 1;
//         s1.name = "Mahesh";
//         s1.marks = 88;

//         Student s2 = new Student();
//         s2.rollno = 2;
//         s2.name = "Rakesh";
//         s2.marks = 58;

//         Student s3 = new Student();
//         s3.rollno = 3;
//         s3.name = "Natraj";
//         s3.marks = 98;

//         Student students[] = new Student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

//         // for(int i = 0; i<students.length; i++)
//         // {
//         //     System.out.println(students[i].name + " : " + students[i].marks);
//         // }

//         //Enahanced for loop (foreach loop)
//         for(Student stud : students){
//             System.out.println(stud.name + " : " + stud.marks);
//         }

//         //Ex-2
//         int nums[] = new int[4];
//         nums[0] = 4;
//         nums[1] = 8;
//         nums[2] = 12;
//         nums[3] = 16;

//         for(int n: nums){
//             System.out.println(n);
//         }
//     }
// }

//String -  String is inbuilt class and it provides bunch of default methods.
// public class Demo{
//     public static void main(String a[]){
//         String name = new String("Ritik");
//         //we can define as below
//         System.out.println(name);
//         String sureName = "Sharma";
//         System.out.println(sureName);

//         //String Methods
//         System.out.println(sureName.charAt(0));//S
//         System.out.println(sureName.concat(" Nanded"));//Sharma Nanded

//         //muttable vs immutable
//         String city = "Pune";
//         city = city + "Maharashtra";
//         System.out.print(city);

//         String city1 = "Pune";
//         String city2 = "Pune";
//          // Behind the scene in the JVM the stack will create a different reference address but it referes the same reference address from heap memory.
//         System.out.println(city1 == city2);// true

//         // ****************************
//         //String Buffer
//         StringBuffer sb = new StringBuffer("Sachin");
//         System.out.println(sb);// Sachin
//         sb.append(" Tendulkar");
//         System.out.println(sb);// Sachin Tendulkar
//     }
// }

//static variable - static variable refers to class not object.

// class Mobile
// {
//     String name;
//     int price;
//     static String type;//*

//     public void show(){
//          System.out.println(name + " : " + price + " : " + type + " ");
//     }
// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//         Mobile obj1 = new Mobile();
//         obj1.name = "redmi";
//         obj1.price = 10000;
//         Mobile.type = "smartphone";
        
//         Mobile obj2 = new Mobile();
//         obj2.name = "samsung";
//         obj2.price = 12000;
//         Mobile.type = "smartphone";

//         // obj1.type = "phone";//here both types got changed becuase type is static
//         //We can use class insted of object 
//         Mobile.type = "jiophone";

//         obj1.show();
//         obj2.show();
//     }
// }

// Static method -  static method can't access non static variables directly but it can be by using object reference
// class Mobile
// {
//     String name;
//     int price;
//     static String type;

//     public void show(){
//          System.out.println(name + " : " + price + " : " + type + " ");
//     }
//     // public static void show1(){//*
//     //      System.out.println(name + " : " + price + " : " + type + " ");// name and price can't be access inside static method because they are nonstatic variable but we can type variable.
//     // }
//     public static void show1(Mobile obj){//*
//          System.out.println(obj.name + " : " + obj.price + " : " + type + " ");
         
//     }
// }

// public class Demo
// {''
//     public static void main(String a[])
//     {
//         Mobile obj1 = new Mobile();
//         obj1.name = "redmi";
//         obj1.price = 10000;
//         Mobile.type = "smartphone";
        
//         Mobile obj2 = new Mobile();
//         obj2.name = "samsung";
//         obj2.price = 12000;
//         Mobile.type = "smartphone";

//         obj1.show();
//         obj2.show();

//         // Mobile.show1();// error -  non-static variable name cannot be referenced from a static context
//         Mobile.show1(obj1);
//     }
// }


//******* Static block */
// class Mobile
// {
//     String name;
//     int price;
//     static String type;

//     //constructor
//     public Mobile()
//     {
//         name = "";
//         price = 200;
//         System.out.println("in contructor");   
//     }

//     //static block
//     static
//     {
//         type = "phone";
//         System.out.println("in static block");
//     }

//     public void show(){
//          System.out.println(name + " : " + price + " : " + type + " ");
//     }
   
// }

// public class Demo
// {
//     public static void main(String a[]) throws ClassNotFoundException
//     {
//         // Mobile obj1 = new Mobile();
//         // obj1.name = "redmi";
//         // obj1.price = 10000;
//         // Mobile.type = "smartphone";    

//         // obj1.show();

//         Class.forName("Mobile");
//     }
// }


//Encapsulation - encasulate the data/variable into methods and accessible by methods

// class Human 
// {
//     private String name;
//     private int age;
    
//     //setter
//     public void setName(String n)
//     {
//         name = n;
//     }
//     public void setAge(int a)
//     {
//         age = a;
//     }

//     //getter
    
//     public String getName()
//     {
//         return name;
//     }

//     public int getAge()
//     {
//         return age;
//     }
// }

// public class Demo{


// public static void main(String a[])
// {
//     Human obj = new Human();
//     obj.setName("Ganesh");
//     obj.setAge(25);

//     System.out.println(obj.getName() + " " + obj.getAge());
// }
// }

//this keyword - this keyword refers to the current object

// class Human 
// {
//     private String name;
//     private int age;
    
//     //setter
//     public void setName(String name)
//     {
//         this.name = name;
//     }
//     public void setAge(int age)
//     {
//         this.age = age;
//     }

//     //getter
    
//     public String getName()
//     {
//         return name;
//     }

//     public int getAge()
//     {
//         return age;
//     }
// }

// public class Demo{


// public static void main(String a[])
// {
//     Human obj = new Human();
//     obj.setName("Monika");
//     obj.setAge(6);

//     System.out.println(obj.getName() + " " + obj.getAge());
// }
// }



//constructor - constructor is a special method, it has same name as class name.

class Human 
{
    private String name;
    private int age;

    public Human(){
        // System.out.println("in constructor");
        name = "jitendra";
        age = 30;
    }
    
    //setter
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    //getter
    
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

public class Demo{


public static void main(String a[])
{
    Human obj = new Human();
    Human obj1 = new Human();
    // Note - Everytime when objct creates constructor will called
    //here two will times constructor called.
    System.out.println(obj.getName() + " " + obj.getAge());

    // obj.setName("Monika");
    // obj.setAge(6);

    // System.out.println(obj.getName() + " " + obj.getAge());
}
}

