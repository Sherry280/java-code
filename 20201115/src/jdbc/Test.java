package jdbc;

import java.math.BigDecimal;
import java.sql.*;

public class Test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        // 创建数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher?user=root&password=0318&useUnicode=true&characterEncoding=UTF-8");
        System.out.println(connection);

        Statement statement=connection.createStatement();

        String sql="select id,name,role,salary from emp";
        ResultSet resultSet=statement.executeQuery(sql);


        while(resultSet.next()){
            int id=resultSet.getInt("id");
            String name=resultSet.getString("name");
            String role=resultSet.getString("role");
            BigDecimal salary=resultSet.getBigDecimal("salary");
            System.out.printf("id=%s,name=%s,role=%s,salary=%s%n",id,name,role,salary);

        }




    }

}
