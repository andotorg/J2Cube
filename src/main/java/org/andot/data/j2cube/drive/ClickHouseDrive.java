package org.andot.data.j2cube.drive;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * click house database drive
 * @author lucas
 * @date 2020-7-28 15:04:38
 * @since 1.0
 */
public class ClickHouseDrive extends J2CubeDrive {
    @Override
    public <T> List<T> executeQuery(String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        return null;
    }
}
