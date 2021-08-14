public class CreditAccount extends Account {

    public CreditAccount(String accountName, int amount) {
        super(accountName, amount);

    }

    @Override
    public boolean add(int amount) {
        if (this.amount + amount > 0) {
            System.out.println("Oshybka! Nelzya popolnit kreditku na etu summu");
            return false;
        }

        this.amount += amount;
        System.out.println("Na schet: " + accountName + "vneseno - " + amount + "y.e");
        return false;

    }

    @Override
    public boolean pay(int amount) {
        this.amount -= amount;
        System.out.println("Oplata s:" + accountName + "na" + amount + "y.e");
        return false;

    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (!account.add(amount)) {
            System.out.println("Perevod s: " + accountName + "na" + account + "ne udalsya");
            return false;

        }

        this.amount -= amount;
        System.out.println("Sovershen perevod s: " + accountName + "na" + account + " - " + amount + "y.e");
        return false;
    }
}
