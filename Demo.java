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

class Calculator{
  
    public int add(int n1, int n2){ //method
        int r = n1 + n2;
        return r;
    }
    // public double add(double n1, int n2){ //method
    //     int r = n1 + n2;
    //     return r;
    // }
    public int add(int n1, int n2, int n3){ //method
        int r = n1 + n2+ n3;
        return r;
    }
}

public class Demo{
public static void main(String a[]){
    int num1 = 4;
    int num2 = 5;
    int num3 = 6;

    Calculator calc = new Calculator();// instance, 
    //calc is a variable.

    int result = calc.add(num1, num2);
    // double result1 = calc.add(1.0, num3);
    int result2 = calc.add(num1, num2,num3);

    System.out.println(result);//9
    System.out.println(result2);//15
}
}