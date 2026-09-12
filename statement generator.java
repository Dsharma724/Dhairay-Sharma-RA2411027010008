//4
public class StatementGenerator {
    public String generate(BankAccount account) {
        return "Account Statement\n" +
               "Balance: " + account.getBalance();
    }
}
