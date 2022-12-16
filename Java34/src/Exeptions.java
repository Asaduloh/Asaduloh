import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Exeptions {
    public static void main(String[] args) {
        try {
            int a = getIntWithTryCatch();
            int b = getIntWithTryCatch();
            System.out.println(divide(a, b));
            System.out.println(divideLBYL(a, b));
            System.out.println(divideEAFP(a, b));
           // System.out.println(getInt());
            System.out.println(getIntWithTryCatch());
        } catch (InputMismatchException | ArithmeticException ex) {
            System.out.println("You are not entering numbers");
        } catch (NoSuchElementException ex) {
            System.out.println("No such element");
        }
    }

    public static int divideLBYL(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }
    public static int divideEAFP(int a,int b){
        try {
            return a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public static int divide(int a , int b){
        return a/b;
    }

    public static int getIntWithTryCatch() {//Easier to Ask Forgiveness than Permission
        System.out.println("Enter your input: ");
        try {
            Scanner scanner = new Scanner(System.in);
            var num = scanner.nextInt();
            System.out.println("This shouldn't work");
            return num;
        } catch (InputMismatchException ex) {
            System.out.println("Enter your input again: ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (NoSuchElementException ex) {
            System.out.println("No such element");
        } catch (RuntimeException ex) {
            System.out.println("Runtime ex");
        } catch (Exception ex) {
            System.out.println("Exception");
        }
        return 0;
    }

}
