package com.sc.tree;

/**
 * Created by loveoh on 2020/6/26.
 */
public interface User1 extends User {
    void hello();


   default boolean hi(){
        return true;
    }
}
