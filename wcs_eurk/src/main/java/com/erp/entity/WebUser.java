package com.erp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户类
 * @author zjx
 * @version 1.0
 * @date 2020/5/17 19:35:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode()
public class WebUser implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userNo;
    private String password;
    private String address;
    private String email;
    private String userTel;
    private Integer userLevel;
    private String userName;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private Integer insertId;
    private Date insertYMD;
    private Integer updateId;
    private Date updateYMD;
}
