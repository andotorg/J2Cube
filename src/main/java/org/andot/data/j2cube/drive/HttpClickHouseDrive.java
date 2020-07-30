package org.andot.data.j2cube.drive;

import ru.yandex.clickhouse.ClickHouseStatement;

import java.sql.SQLException;
import java.util.List;

/**
 * click house database drive
 * use http connection method
 * @author lucas
 * @date 2020-7-28 15:04:38
 * @since 1.0
 */
public class HttpClickHouseDrive extends J2CubeDrive {
    @Override
    public <T> List<T> executeQuery(String sql) throws SQLException {
        ClickHouseStatement clickHouseStatement = (ClickHouseStatement) connection.createStatement();
        clickHouseStatement.executeQuery(sql);
        return null;
    }
}
