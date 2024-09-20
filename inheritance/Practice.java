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