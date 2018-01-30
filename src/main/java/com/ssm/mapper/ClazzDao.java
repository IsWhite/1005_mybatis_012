package com.ssm.mapper;

import com.ssm.domain.Clazz;

import java.util.List;

/**
 * Created by dllo on 18/1/30.
 */
public interface ClazzDao {
    //除了根据主键id查询的,其他返回类型都是集合
    List<Clazz> select(Clazz clazz);

    /*批量主键id查询*/
    List<Clazz> selectInID(List<Integer> ids);
}
