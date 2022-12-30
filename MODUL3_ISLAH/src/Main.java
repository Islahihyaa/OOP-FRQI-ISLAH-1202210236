import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        
        Calculation calculation = new Calculation();
        Thread t1 = new Thread(calculation);
        Scanner myScan= new Scanner(System.in);
        boolean repeat = true;
        int operation;

        do {
            System.out.println("===Menu Program===\n 1. Square\n 2. Circle\n 3.Trapezoid");
            System.out.println("Select Menu : ");
            operation = myScan.nextInt();
            try {
                switch (operation) {
                    case 1:
                        System.out.println("Enter the length of the side of the square : ");
                        double side = myScan.nextDouble();
                        calculation.setSquare(side);
                        t1.start();
                        t1.join();
                        System.out.println("The calculation result : " + calculation.getSquare());
                        break;

                    case 2:
                        System.out.println("Enter the radius of the circle : ");
                        double radius = myScan.nextDouble();
                        calculation.setCircle(radius);
                        t1.start();
                        t1.join();
                        System.out.println("The calculation result is: " + calculation.getCircle());
                    
                    case 3:
                        System.out.println("Insert the side of the base of the trapezoid : ");
                        double a = myScan.nextDouble();
                        System.out.println("enter the upper side of the trapezoid: ");
                        double b = myScan.nextDouble();
                        System.out.println("enter height: ");
                        double c = myScan.nextDouble();

                        calculation.setTrapezoid(a,b,c);
                        t1.start();
                        t1.join();
                        
                        System.out.println("The calculation result: " + calculation.getTrapezoid());
                        break;
                        

                    default:
                        System.out.println("option not Available");
                        continue;
                }
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("INPUT MUST BE NUMBER!!!!");
            } catch (IllegalArgumentException e) {
                System.out.println("INPUT MUST BE NUMBER");
            }
        } while (repeat);
        myScan.close();
    }
}
