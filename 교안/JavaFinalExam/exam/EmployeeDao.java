package exam;

import exam.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public List<Employee> findAll() throws SQLException {
        String sql = "SELECT EMP_ID, EMP_NAME, SALARY "
                + "FROM EMP "
                + "ORDER BY EMP_ID";

        List<Employee> employees = new ArrayList<>();

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                employees.add(new Employee(
                        resultSet.getString("EMP_ID"),
                        resultSet.getString("EMP_NAME"),
                        (Integer) resultSet.getObject("SALARY")
                ));
            }
        }

        return employees;
    }
}
