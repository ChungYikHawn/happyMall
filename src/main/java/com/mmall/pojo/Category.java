package com.mmall.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

/**
 * mmall_category
 * @author 
 */
@Data
public class Category implements Serializable {
    /**
     * 类别Id
     */

    private Integer id;

    /**
     * 父类别id当id=0时说明是根节点,一级类别
     */
    private Integer parentId;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 类别状态1-正常,2-已废弃
     */
    private Boolean status;

    /**
     * 排序编号,同类展示顺序,数值相等则自然排序
     */
    private Integer sortOrder;

    /**
     * 创建时间
     */
    private Date createTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}