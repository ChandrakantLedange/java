public class Practice
{
    public static void main(String a[]){
        AdvCalc obj = new AdvCalc();
        //create object of sub class

        int r1 = obj.add(4,5);
        int r2 = obj.sub(6,5);
        int r3 = obj.mul(2,5);
        int r4 = obj.div(10,5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}

//Need of inheritance:
//let's say the simple calc is already built.
//client came to you and said hey i want to add some feature to calc like SIN , COS
// so there is a way you can add new methods to Calc class or you can create a another class AdvCalc copy all basic feature from Calc class and add into it then create new methods for new feature.

//If you notice there is code redundancy.
//so you can create anothere class called AdvCal and extends the Calc methods into AdvCal class which is called inheritance.