package com.lijin.dao;


import com.lijin.domain.CustomerRemark;
import com.lijin.domain.CustomerRemarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerRemarkMapper {
    int countByExample(CustomerRemarkExample example);

    int deleteByExample(CustomerRemarkExample example);

    int deleteByPrimaryKey(String id);

    int insert(CustomerRemark record);

    int insertSelective(CustomerRemark record);

    List<CustomerRemark> selectByExample(CustomerRemarkExample example);

    CustomerRemark selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CustomerRemark record, @Param("example") CustomerRemarkExample example);

    int updateByExample(@Param("record") CustomerRemark record, @Param("example") CustomerRemarkExample example);

    int updateByPrimaryKeySelective(CustomerRemark record);

    int updateByPrimaryKey(CustomerRemark record);
}