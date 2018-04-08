package com.atao.mapper;

import com.atao.po.AtaoOrder;
import com.atao.po.AtaoOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtaoOrderMapper {
    int countByExample(AtaoOrderExample example);

    int deleteByExample(AtaoOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AtaoOrder record);

    int insertSelective(AtaoOrder record);

    List<AtaoOrder> selectByExample(AtaoOrderExample example);

    AtaoOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AtaoOrder record, @Param("example") AtaoOrderExample example);

    int updateByExample(@Param("record") AtaoOrder record, @Param("example") AtaoOrderExample example);

    int updateByPrimaryKeySelective(AtaoOrder record);

    int updateByPrimaryKey(AtaoOrder record);
}