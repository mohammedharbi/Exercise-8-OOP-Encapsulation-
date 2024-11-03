//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Employee p1= new Employee("1113203499", "Mohammed Alharbi", 12000);
    Employee p2= new Employee("1112203423", "Nawaf Abdullah", 6000);
    Employee p3= new Employee();

    p3.setId("1003566786");
    p3.setName("Fahad Almutiri");
    p3.setSalary(9500);
        System.out.println("---------------");
        System.out.println(p1.toString());
        System.out.println("---------------");
        System.out.println(p2.toString());
        System.out.println("---------------");
        System.out.println("Name is "+p3.getName()+".\n"+
                "ID is "+p3.getId()+".\n"+
                "Salary is "+p3.getSalary()+".");
        System.out.println("---------------");
        System.out.println(p1.getName()+" Annual salary is "+p1.getAnnualSalary()+".");
        System.out.println("Monthly salary: "+p1.getSalary());
        p1.raisedSalary(20);
        System.out.println(p1.getName()+" Annual salary after 20% raise is "+p1.getAnnualSalary()+".");
        System.out.println("Monthly salary after 20% raise: "+p1.getSalary());
    }
}