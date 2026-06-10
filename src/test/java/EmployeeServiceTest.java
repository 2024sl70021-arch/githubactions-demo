import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    @Test
    void shouldAddEmployee() {

        EmployeeService service =
                new EmployeeService();

        service.addEmployee(
                new Employee(1, "Annu"));

        assertEquals(
                2,
                service.getEmployeeCount());
    }
}
