package com.ssm.demo.dao;

import com.ssm.demo.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapperDao {
    Person findPersonById(@Param("id") long id);
}