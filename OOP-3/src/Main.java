// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AzeriCard card = new AzeriCard("Visa");
        card.moneyTransfer("A","B", 100.0);

        System.out.println(card.getCallCenter());
        System.out.println(card.getPaymentService());
    }
}