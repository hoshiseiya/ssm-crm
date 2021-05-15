package com.lijin.dao;

import com.lijin.domain.ClueRemark;
import com.lijin.domain.ClueRemarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClueRemarkMapper {
    int countByExample(ClueRemarkExample example);

    int deleteByExample(ClueRemarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClueRemark record);

    int insertSelective(ClueRemark record);

    List<ClueRemark> selectByExample(ClueRemarkExample example);

    ClueRemark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClueRemark record, @Param("example") ClueRemarkExample example);

    int updateByExample(@Param("record") ClueRemark record, @Param("example") ClueRemarkExample example);

    int updateByPrimaryKeySelective(ClueRemark record);

    int updateByPrimaryKey(ClueRemark record);
}