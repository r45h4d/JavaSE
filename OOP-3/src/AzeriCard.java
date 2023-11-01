public final class AzeriCard implements MoneyTransaction{
    public AzeriCard(String paymentService) {
        this.paymentService = paymentService;
    }

    private String paymentService;
    private String callCenter = "194";

    public String getPaymentService() {
        return paymentService;
    }

    public String getCallCenter() {
        return callCenter;
    }

    @Override
    public void moneyTransfer(String from, String to, Double amount) {
        System.out.println("Money transfered with AzeriCard");
    }
}
