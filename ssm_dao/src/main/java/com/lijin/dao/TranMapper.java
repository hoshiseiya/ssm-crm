package com.lijin.dao;


import com.lijin.domain.Tran;
import com.lijin.domain.TranExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TranMapper {
    int countByExample(TranExample example);

    int deleteByExample(TranExample example);

    int deleteByPrimaryKey(String id);

    int insert(Tran record);

    int insertSelective(Tran record);

    List<Tran> selectByExample(TranExample example);

    Tran selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Tran record, @Param("example") TranExample example);

    int updateByExample(@Param("record") Tran record, @Param("example") TranExample example);

    int updateByPrimaryKeySelective(Tran record);

    int updateByPrimaryKey(Tran record);
}