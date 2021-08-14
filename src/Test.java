public class Test {
    public static void main(String[] args) {
        Account savingAcc = new SavingAccount("Sberegatelnyi schet", 150_000);
        Account chekingAcc = new CheckingAccount("Raschetnyi schet", 80_000);
        Account creditAcc = new CheckingAccount("Kreditka", -150_000);

        savingAcc.transfer(chekingAcc,3000);
        creditAcc.pay(12_000);
        chekingAcc.pay(70_000);
        creditAcc.add(200_000);
        savingAcc.pay(10_000);

        System.out.println("");
        System.out.println(savingAcc.accountName + " " + savingAcc.getAccountName());
        System.out.println(chekingAcc.accountName + " " + chekingAcc.getAccountName());
        System.out.println(creditAcc.accountName + " " + creditAcc.getAccountName());

    }
}