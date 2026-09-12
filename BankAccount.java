//3)
 public class BankAccount{
    private double balance;
    private String accno;
    private String name;


    public bankAcc (String accno,String name){
        this.accno=accno;
        this.name=name;
        this.balance=0
    }
    public void deposit(int amount){
        balance+=amount
    }
    public void withdrawn(int amount){
        if amount<=balance{
            balance-=amount
        }else{
            system.out.print(x:"insufficient  balance")
        }
    }
    public double getbalance(){
        return balance;
    }
    public String getaccno(){
        return accno;
    }
    public String name(){
        return name;
    }
 }