public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(2000);
        account.deposit(5000);
        account.withdraw(1000);

        AccountRepository repository = new AccountRepository();
        repository.save(account);

        NotificationService notificationService = new NotificationService();
        notificationService.send("Transaction completed");

        StatementGenerator statementGenerator = new StatementGenerator();
        String statement = statementGenerator.generate(account);

        System.out.println(statement);
    }
}