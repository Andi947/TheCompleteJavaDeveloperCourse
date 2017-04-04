package com.andi947;

import java.util.List;

/**
 * Created by Andrea on 2017/03/07.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
