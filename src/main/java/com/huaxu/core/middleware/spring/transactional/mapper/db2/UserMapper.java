package com.huaxu.core.middleware.spring.transactional.mapper.db2;

import com.huaxu.core.middleware.spring.transactional.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    /**
     *
     * @generated
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @generated
     */
    int insert(User record);

    /**
     *
     * @generated
     */
    int insertSelective(User record);

    /**
     *
     * @generated
     */
    User selectByPrimaryKey(String id);

    /**
     *
     * @generated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @generated
     */
    int updateByPrimaryKey(User record);
}