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
class Student
{
    int rollno;
    String name;
    int marks;    
}

public class Demo
{
    public static void main(String a[])
    {
       Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Mahesh";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Rakesh";
        s2.marks = 58;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Natraj";
        s3.marks = 98;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i<students.length; i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}