package org.gp.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Tuple3<M,N,K> {
    private M c1;
    private N c2;
    private K c3;
}
