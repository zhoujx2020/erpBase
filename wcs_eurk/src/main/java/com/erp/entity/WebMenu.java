package com.erp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单类
 * @author zjx
 * @version 1.0
 * @date 2020/5/18 17:02:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode()
public class WebMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    private long menuId;
    private String iconFont;
    private String path;
    private Long menuParent;
    private String menuName;
    private Integer menuLevel;
    private Integer InnerMenuLevel;
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
