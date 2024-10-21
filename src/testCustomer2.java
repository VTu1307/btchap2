public class testCustomer2 {
    public static void main(String[] args) {
        Customer2 customer1 =new Customer2("Vtuu",1,'M');
        Account account1 =new Account(1,customer1,1000.0);
        System.out.println(customer1);
        account1.deposit (500);
        System.out.println("After deposit "+account1);
        account1.withdraw(2000);
        System.out.println("After withdraw "+account1);
    }

}
