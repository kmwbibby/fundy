package com.kbkode.fundy.entity;

import java.io.Serializable;

/**
 *
 * @author kbibby
 * @param <T>
 */
public interface UniqueKey<T> extends Serializable {
    
    T getId();
}
