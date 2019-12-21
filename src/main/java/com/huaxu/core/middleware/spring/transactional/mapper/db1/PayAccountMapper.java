package com.huaxu.core.middleware.spring.transactional.mapper.db1;

import com.huaxu.core.middleware.spring.transactional.bean.PayAccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayAccountMapper {
    /**
     *
     * @generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @generated
     */
    int insert(PayAccount record);

    /**
     *
     * @generated
     */
    int insertSelective(PayAccount record);

    /**
     *
     * @generated
     */
    PayAccount selectByPrimaryKey(Integer id);

    /**
     *
     * @generated
     */
    int updateByPrimaryKeySelective(PayAccount record);

    /**
     *
     * @generated
     */
    int updateByPrimaryKey(PayAccount record);
}