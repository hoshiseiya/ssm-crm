package com.lijin.dao;

import com.lijin.domain.ContactsActivityRelation;
import com.lijin.domain.ContactsActivityRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactsActivityRelationMapper {
    int countByExample(ContactsActivityRelationExample example);

    int deleteByExample(ContactsActivityRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(ContactsActivityRelation record);

    int insertSelective(ContactsActivityRelation record);

    List<ContactsActivityRelation> selectByExample(ContactsActivityRelationExample example);

    ContactsActivityRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ContactsActivityRelation record, @Param("example") ContactsActivityRelationExample example);

    int updateByExample(@Param("record") ContactsActivityRelation record, @Param("example") ContactsActivityRelationExample example);

    int updateByPrimaryKeySelective(ContactsActivityRelation record);

    int updateByPrimaryKey(ContactsActivityRelation record);
}