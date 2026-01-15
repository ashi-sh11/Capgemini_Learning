package Task_15_01_26.Level1;

public class Area {
    public static void main(String[] args) {
        AreaOfCircle circle =new  AreaOfCircle(5);
        System.out.println( circle.area());
        System.out.println( circle.circumference());
    }
}
class AreaOfCircle{
    private int radius ;
    final double PI = 3.14;

     AreaOfCircle(int radius){
        this.radius =radius;
    }
    public double area(){
        return PI *radius*radius;
    }

    public double circumference(){
        return 2*PI *radius;
    }
}