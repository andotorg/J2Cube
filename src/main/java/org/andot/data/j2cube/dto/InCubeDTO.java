package org.andot.data.j2cube.dto;

import java.util.List;

/**
 *
 */
public class InCubeDTO {
    private List<Dimension> dimensions;

    class Dimension {
        private String type;
        private String fieldName;

    }
}
