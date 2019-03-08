package com.xl.git.Dao;

import java.util.List;
import java.util.Map;

/**
 * fileName:UserDao
 * description:
 * author:zz
 * createTime:2019/3/2
 */
public interface UserDao {

    /**
     * 获取人员列表
     * @return
     */
    List<Map> getUserList();
}
