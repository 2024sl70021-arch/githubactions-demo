public class App {

    public static void main(String[] args) {

        EmployeeService service =
                new EmployeeService();

        service.addEmployee(
                new Employee(1, "Annu"));

        System.out.println(
                "Employee Count: "
                + service.getEmployeeCount());
    }
}
