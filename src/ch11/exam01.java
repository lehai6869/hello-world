package ch11;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class exam01 {
    public static void main(String[] args) {


        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //DriverManager.registerDriver("com.mysql.cj.jdbc.Driver"); //麻烦
            String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=GMT&useSSL=false";
            String username="root";
            String password = "123456";
            conn=DriverManager.getConnection(url,username,password);

            //Statement接口用于执行静态的SQL语句
            stmt = conn.createStatement();
            String sql = "select * from users";
            rs = stmt.executeQuery(sql);

            System.out.println("|    id    |    name    |    password     |    email     |    birthday     |");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String psw = rs.getString("password");
                String email = rs.getString("email");
                Date birthday = rs.getDate("birthday");
                System.out.println(id+ "    |     "+name+"    |     "+psw+"    |     "+email+"    |     "+birthday );
            }

           // PreparedStatement接口是Statement接口的子接口，用于执行预编译的SQL语句，接口中的SQL语句可以使用占位符“？”代替参数，然后通过setter方法为SQL语句的参数赋值
//            String sql1 = "insert into users(name,email) values(?,?)";
//            ps = conn.prepareStatement(sql1);
//            ps.setString(1,"李四");
//            ps.setObject(2,"ss@m.com");
//            ps.executeUpdate();

            String sql1 = "select * from users where id = ?";
            ps = conn.prepareStatement(sql1);
            ps.setInt(1,2);
            rs = ps.executeQuery(); //注意：excuteQuery()函数无参数

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String psw = rs.getString("password");
                String email = rs.getString("email");
                Date birthday = rs.getDate("birthday");
                System.out.println(id+ "    |     "+name+"    |     "+psw+"    |     "+email+"    |     "+birthday );
            }
        }catch(Exception e) {
            e.printStackTrace();
        } finally {
            if (rs!=null) {
                try {
                    rs.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}