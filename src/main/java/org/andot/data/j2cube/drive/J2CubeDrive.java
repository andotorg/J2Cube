package org.andot.data.j2cube.drive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * 驱动器抽象类
 * @author lucas
 * @date 2020-7-28 15:04:38
 * @since 1.0
 */
public abstract class J2CubeDrive {

    public static volatile Connection connection;

    /**
     * 获取数据库连接对象
     * @param url 连接字符串的url
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public void connection(String className, String url, String username, String password){
        try {
            Class.forName(className);
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 执行查询列表
     * @return
     */
    public abstract <T> List<T> executeQuery(String sql) throws SQLException;
}
