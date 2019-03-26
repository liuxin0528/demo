/*
 * Copyright 2019 by 青岛比特信息科技有限公司 .
 * All rights reserved.
 */
package com.example.demo.repository;

import org.hibernate.sql.OracleJoinFragment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * @author liuxin <br>
 * @date 2019/3/26 17:04 <br>
 * @project demo <br>
 * @description <br>
 */
@NoRepositoryBean
public interface ExpandJpaRepository<T,ID extends Serializable> extends JpaRepository<T,ID> {

    T findOne(String condition, Object... objects);

    List<T> findAll(String condition, Object... objects);

}
