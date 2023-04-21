class Customer {
    String name;
    String accNo;
    long accBalance;
    String address;

    public void withdraw(long amount) {
        this.accBalance = this.accBalance - amount;
    }

    public void deposit(long amount) {
        this.accBalance = this.accBalance + amount;
    }
}

class employ {
    String name;
    String employid;
    int salary;
    int Deposite;
    int Withdraw;
    int loan;
    int No_OF_Loans;
    int No_of_Deposites;
    int No_of_withdraws;

    public void Accepting_Deposite(int No_of_Deposites){
        this.Deposite =this.Deposite + No_of_Deposites;

    }

    /**
     * @param No_of_withdraws
     */
    public void Accepting_Withdraw(int No_of_withdraws) {
        this.Withdraw=this.Withdraw+ No_of_withdraws;
    }

    /**
     * @param No_OF_Loans
     */
    public void loan(int No_OF_Loans) {
        this.loan=this.loan+No_OF_Loans;
    }
    

}

public class BankingApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "kiran";
        customer1.accNo = "123456";
        customer1.accBalance = 9000;
        customer1.address = "Hyderabad";
        customer1.withdraw(8000);
        System.out.println("--------------------------------------");
        Customer customer2 = new Customer();
        customer2.name = "shruthi";
        customer2.accNo = "123454321";
        customer2.accBalance = 7898;
        customer2.address = "Hyderabad";
        customer2.deposit(8000);
        System.out.println("------------------------------");
        employ employ1=new employ();
        employ1.name ="verma";
        employ1.employid ="19BEC0583";
        employ1.salary = 50000;
        employ1.loan(1);
        employ1.Accepting_Deposite(5);
        employ1.Accepting_Withdraw(2);
        System.out.println("-------------------");
        employ employ2=new employ();
        employ2.name="karthik";
        employ2.employid="234ghdy";
        employ2.salary = 70000;
        employ2.Accepting_Deposite(9);
        employ2.Accepting_Withdraw(5);
        employ2.loan(3);
        System.out.println(customer1.name);
        System.out.println(customer1.accNo);
        System.out.println(customer1.accBalance);
        System.out.println(customer1.address);
        System.out.println("---------------------------------------------------");
        System.out.println(customer2.name);
        System.out.println(customer2.accNo);
        System.out.println(customer2.accBalance);
        System.out.println(customer2.address);
        System.out.println("-------------------------------------------------------");
        System.out.println(employ1.name);
        System.out.println(employ1.employid);
        System.out.println(employ1.salary);
        System.out.println(employ1.No_OF_Loans);
        System.out.println(employ1.No_of_Deposites);
        System.out.println(employ1.No_of_withdraws);
        System.out.println("---------------------------------------------------------");
        System.out.println(employ2.name);
        System.out.println(employ2.employid);
        System.out.println(employ2.salary);
        System.out.println(employ2.No_OF_Loans);
        System.out.println(employ2.No_of_Deposites);
        System.out.println(employ2.No_of_withdraws);



    }
}
