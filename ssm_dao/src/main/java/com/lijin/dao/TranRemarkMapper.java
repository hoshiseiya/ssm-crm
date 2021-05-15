package com.lijin.dao;


import com.lijin.domain.TranRemark;
import com.lijin.domain.TranRemarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TranRemarkMapper {
    int countByExample(TranRemarkExample example);

    int deleteByExample(TranRemarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(TranRemark record);

    int insertSelective(TranRemark record);

    List<TranRemark> selectByExample(TranRemarkExample example);

    TranRemark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TranRemark record, @Param("example") TranRemarkExample example);

    int updateByExample(@Param("record") TranRemark record, @Param("example") TranRemarkExample example);

    int updateByPrimaryKeySelective(TranRemark record);

    int updateByPrimaryKey(TranRemark record);
}