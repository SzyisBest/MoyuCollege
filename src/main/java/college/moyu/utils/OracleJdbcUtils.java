package college.moyu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJdbcUtils {
    public static final String driver = "oracle.jdbc.driver.OracleDriver";
    public static final String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    public static final String user = "system";
    public static final String password = "123456";

    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(OracleJdbcUtils.driver);
            conn = DriverManager.getConnection(OracleJdbcUtils.url,OracleJdbcUtils.user,OracleJdbcUtils.password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
