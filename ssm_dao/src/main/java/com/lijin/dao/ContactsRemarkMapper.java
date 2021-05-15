package com.lijin.dao;


import com.lijin.domain.ContactsRemark;
import com.lijin.domain.ContactsRemarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactsRemarkMapper {
    int countByExample(ContactsRemarkExample example);

    int deleteByExample(ContactsRemarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(ContactsRemark record);

    int insertSelective(ContactsRemark record);

    List<ContactsRemark> selectByExample(ContactsRemarkExample example);

    ContactsRemark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ContactsRemark record, @Param("example") ContactsRemarkExample example);

    int updateByExample(@Param("record") ContactsRemark record, @Param("example") ContactsRemarkExample example);

    int updateByPrimaryKeySelective(ContactsRemark record);

    int updateByPrimaryKey(ContactsRemark record);
}