package com.ixtens.triangle.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Triangle {

    private Side sideA;
    private Side sideB;
    private Side sideC;
}
