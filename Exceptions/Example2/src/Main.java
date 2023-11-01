import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 20;
        Scanner s = new Scanner(System.in);

            try {
                if(balance-s.nextDouble()<0){
                throw new Exception("Balansınız kifayət deyil");}
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
    }

}
