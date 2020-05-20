package com.erp.service.impl;

import com.erp.dao.WenUserDao;
import com.erp.entity.WebUser;
import com.erp.service.WebUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zjx
 * @version 1.0
 * @date 2020/5/19 23:19:50
 */
@Service
public class WebUserServiceImpl implements WebUserService {
    @Resource
    private WenUserDao wenUserDao;
    @Override
    public int create(WebUser webUser) {
        return wenUserDao.create(webUser);
    }

    @Override
    public WebUser queWebUserByNo(String userNo) {
        return wenUserDao.queWebUserByNo(userNo);
    }

    @Override
    public WebUser queWebUserById(Long id) {
        return wenUserDao.queWebUserById(id);
    }
}
