public abstract class Account {
    protected String accountName;
    protected int amount;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Account(String accountName, int amount) {

    }

    public abstract boolean add(int amount);

    public abstract boolean pay(int amount);

    public abstract boolean transfer(Account account, int amount);

    public String toString() {
        return accountName;
    }

}