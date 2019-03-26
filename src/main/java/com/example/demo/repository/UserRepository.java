/*
 * Copyright 2019 by 青岛比特信息科技有限公司 .
 * All rights reserved.
 */
package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author liuxin <br>
 * @date 2019/3/23 10:52 <br>
 * @project demo <br>
 * @description <br>
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select t from User t where t.name = ?1 ")
    User findByName(String name);
}
