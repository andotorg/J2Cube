package org.andot.data.j2cube.cube.imple;

import org.andot.data.j2cube.cube.J2Cube;
import org.andot.data.j2cube.drive.PostgresDrive;
import org.andot.data.j2cube.dto.ConnectionInfoDTO;
import org.andot.data.j2cube.dto.InCubeDTO;
import org.andot.data.j2cube.dto.OutCubeDTO;

/**
 * PostgreSQL cube
 * 每一种数据源都会有一个cube
 */
public class PostgresCube implements J2Cube {
    private final ConnectionInfoDTO connectionInfoDTO;
    public PostgresCube (ConnectionInfoDTO connectionInfoDTO){
        this.connectionInfoDTO = connectionInfoDTO;
    }

    @Override
    public OutCubeDTO reversal(InCubeDTO inCubeDTO) {
        PostgresDrive postgresDrive = new PostgresDrive();
        return null;
    }
}
