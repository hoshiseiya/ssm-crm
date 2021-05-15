package com.lijin.dao;


import com.lijin.domain.DicValue;
import com.lijin.domain.DicValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DicValueMapper {
    int countByExample(DicValueExample example);

    int deleteByExample(DicValueExample example);

    int deleteByPrimaryKey(String id);

    int insert(DicValue record);

    int insertSelective(DicValue record);

    List<DicValue> selectByExample(DicValueExample example);

    DicValue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DicValue record, @Param("example") DicValueExample example);

    int updateByExample(@Param("record") DicValue record, @Param("example") DicValueExample example);

    int updateByPrimaryKeySelective(DicValue record);

    int updateByPrimaryKey(DicValue record);
}