package com.mmall.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * mmall_cart
 * @author 
 */
@Data
public class Cart implements Serializable {
    private Integer id;

    private Integer userId;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 是否选择,1=已勾选,0=未勾选
     */
    private Integer checked;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}