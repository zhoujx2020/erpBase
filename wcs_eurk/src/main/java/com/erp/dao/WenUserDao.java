package com.erp.dao;

import com.erp.entity.WebUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户操作类
 * @author zjx
 * @version 1.0
 * @date 2020/5/19 22:21:34
 */
@Mapper
public interface WenUserDao {
    /**
     * 创建新用户
     * @param webUser
     * @return
     */
    public int create(WebUser webUser);

    /**
     * 根据用户名查找用户
     * @param userNo
     * @return
     */
    public WebUser queWebUserByNo(@Param("userNo") String userNo);

    /**
     * 根据主键查找用户
     * @param userNo
     * @return
     */
    public WebUser queWebUserById(@Param("id") Long id);
}
