package com.lijin.dao;

import com.lijin.domain.ClueActivityRelation;
import com.lijin.domain.ClueActivityRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClueActivityRelationMapper {
    int countByExample(ClueActivityRelationExample example);

    int deleteByExample(ClueActivityRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClueActivityRelation record);

    int insertSelective(ClueActivityRelation record);

    List<ClueActivityRelation> selectByExample(ClueActivityRelationExample example);

    ClueActivityRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClueActivityRelation record, @Param("example") ClueActivityRelationExample example);

    int updateByExample(@Param("record") ClueActivityRelation record, @Param("example") ClueActivityRelationExample example);

    int updateByPrimaryKeySelective(ClueActivityRelation record);

    int updateByPrimaryKey(ClueActivityRelation record);
}