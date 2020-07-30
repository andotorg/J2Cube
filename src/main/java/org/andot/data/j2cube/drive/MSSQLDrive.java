package org.andot.data.j2cube.drive;

import org.andot.data.j2cube.dto.ConnectionInfoDTO;

import java.util.List;

/**
 * click house database drive
 * @author lucas
 * @date 2020-7-28 15:04:38
 * @since 1.0
 */
public class MSSQLDrive extends J2CubeDrive {

    /**
     * 文件类型支持 yml properties
     * @param configFilePath
     */
    public MSSQLDrive (String configFilePath) {

    }

    public MSSQLDrive(ConnectionInfoDTO connectionInfo) {
        this.connection(connectionInfo.getClassName(), connectionInfo.getUrl(), connectionInfo.getUsername(), connectionInfo.getPassword());
    }

    @Override
    public <T> List<T> executeQuery(String sql) {

        return null;
    }
}
