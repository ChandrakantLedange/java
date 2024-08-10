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
class Computer{

    public void playMusic(){
     System.out.println("Music playing...");

    }
    public String bugAPen(int cost){
        return "Pen";
    }
    
}

public class Demo{
public static void main(String a[]){
    Computer obj  = new Computer();
    obj.playMusic();//music playing
    String str = obj.bugAPen(10);
    System.out.println(str);//pen
}
}