// class and objects.

class Calculator{
    int a; //variable
    public int add(int n1, int n2){ //method
        int r = n1 + n2;
        return r;
    }
}

public class Demo{
public static void main(String a[]){
    int num1 = 4;
    int num2 = 5;

    Calculator calc = new Calculator();// instance, 
    //calc is a variable.

    int result = calc.add(num1, num2);

    System.out.println(result);//9
}
}