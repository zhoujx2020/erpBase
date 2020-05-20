package com.erp.service;

import com.erp.entity.WebUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author zjx
 * @version 1.0
 * @date 2020/5/19 23:19:04
 */
public interface WebUserService {
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
