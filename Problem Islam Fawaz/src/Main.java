import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addEmployee(new Employee("slama", 4444));
        manager.addEmployee(new Employee("manga", 3000));
        manager.addEmployee(new Employee("7ooda", 2000));

        double totalSalary = manager.calculateTotalSalary();
        System.out.println("Total salary: " + totalSalary);
    }
}
