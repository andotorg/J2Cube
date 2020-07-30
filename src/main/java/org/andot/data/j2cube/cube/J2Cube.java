package org.andot.data.j2cube.cube;

import org.andot.data.j2cube.dto.InCubeDTO;
import org.andot.data.j2cube.dto.OutCubeDTO;

/**
 * cube interface
 * input： config data
 * output: agg data
 * data format see README.md
 */
public interface J2Cube {
    /**
     * 通过输入配置信息反转为输出数据信息
     * @param inCubeDTO 输入配置信息
     * @return 输出聚合后的信息
     */
    OutCubeDTO reversal(InCubeDTO inCubeDTO);
}
