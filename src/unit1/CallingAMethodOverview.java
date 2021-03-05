package unit1;

public class CallingAMethodOverview {
    public static void main(String[] args) {
        System.out.println("Hello from yhe main method");
        CallingAMethodOverview object = new CallingAMethodOverview();
        object.myMethod();
    }

    public void myMethod(){
        System.out.println("Output From myMethod !");
    }
}
