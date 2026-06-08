import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    @Test
    void shouldAddEmployee() {

        EmployeeService service =
                new EmployeeService();

        service.addEmployee(
                new Employee(1, "Ankit"));

        assertEquals(
                1,
                service.getEmployeeCount());
    }
}
