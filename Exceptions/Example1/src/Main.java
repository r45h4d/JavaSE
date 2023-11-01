import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //example 1
        try{
            int num = s.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Daxil edilen format duzgun deyil");
        }
        catch (Exception ex){
            System.out.println("Xeta : " + ex.getMessage());
        }
    }
}