package com.example.createmodel.entity;

import java.io.Serializable;

/**
 * (CrmTagType)实体类
 *
 * @author fancky
 * @since 2021-10-20 11:15:30
 */
public class CrmTagType implements Serializable {
    private static final long serialVersionUID = 286906363341414209L;
    
    private Integer id;
    /**
    * 标签类型名称
    */
    private String name;
    /**
    * 父节点id
    */
    private Integer parentId;
    /**
    * 是否删除：0否，1是
    */
    private Boolean isDeleted;

}