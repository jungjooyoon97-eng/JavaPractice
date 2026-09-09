package exam;

import java.sql.SQLException;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        try {
            List<Employee> employees = new EmployeeDao().findAll();

            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        } catch (SQLException e) {
            System.out.println("사원 목록 조회 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}
