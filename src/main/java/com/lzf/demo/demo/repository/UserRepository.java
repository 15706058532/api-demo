package com.lzf.demo.demo.repository;

import com.lzf.demo.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 写点注释
 * <br/>
 * Created in 2019-04-03 18:06:12
 * <br/>
 *
 * @author Lzf
 */
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
}
