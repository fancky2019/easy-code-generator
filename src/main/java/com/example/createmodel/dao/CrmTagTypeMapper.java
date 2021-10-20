package com.example.createmodel;

import com.example.createmodel.entity.CrmTagType;
import com.example.createmodel.model.entity.CrmTagType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CrmTagType)表数据库访问层
 *
 * @author fancky
 * @since 2021-10-20 11:15:32
 */
public interface CrmTagTypeMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CrmTagType queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CrmTagType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param crmTagType 实例对象
     * @return 对象列表
     */
    List<CrmTagType> queryAll(CrmTagType crmTagType);

    /**
     * 新增数据
     *
     * @param crmTagType 实例对象
     * @return 影响行数
     */
    int insert(CrmTagType crmTagType);

    /**
     * 修改数据
     *
     * @param crmTagType 实例对象
     * @return 影响行数
     */
    int update(CrmTagType crmTagType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}