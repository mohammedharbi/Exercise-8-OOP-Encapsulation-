//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account p1 = new Account("1113203499", "Mohammed Alharbi", 12000);
        Account p2 = new Account("1112203423", "Nawaf Abdullah", 6000);
        Account p3 = new Account("1003244543", "Ziad Saad");
        Account p4 = new Account();

        p1.credit(10000);
        p1.debit(2000);
        p1.debit(20001); // It cannot withdraw if the amount to withdraw is larger than the balance.
        System.out.println("--------------");// print users info before the Transfer.
        System.out.println(p1.toString());
        System.out.println("---------------");
        System.out.println(p2.toString());
        p1.transferTo(p2,1750);
        System.out.println("--------------");// print users info after the Transfer.
        System.out.println(p1.toString());
        System.out.println("--------------");
        System.out.println(p2.toString());
        System.out.println("--------------");
        p3.setBalance(10000);
        System.out.println(p3.toString());
        System.out.println("--------------");
        p4.setId("1002664583");
        p4.setName("Abdullah Alsaeed");
        p4.setBalance(7500);
        System.out.println(p4.toString());
        System.out.println("--------------");
        p3.transferTo(p4,2500);
        System.out.println(p4.getName()+" Account.\n"+
                "the ID is: "+p4.getId()+".\n"+
                "Current balance: "+p4.getBalance()+".");
    }
}