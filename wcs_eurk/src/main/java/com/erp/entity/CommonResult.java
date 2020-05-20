package com.erp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.boot.jdbc.metadata.DataSourcePoolMetadata;

/**
 * 与前端的通讯包
 * @author zjx
 * @version 1.0
 * @date 2020/5/19 22:06:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode()
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
