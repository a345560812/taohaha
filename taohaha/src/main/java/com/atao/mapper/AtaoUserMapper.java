package com.atao.mapper;

import com.atao.po.AtaoUser;
import com.atao.po.AtaoUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtaoUserMapper {
    int countByExample(AtaoUserExample example);

    int deleteByExample(AtaoUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(AtaoUser record);

    int insertSelective(AtaoUser record);

    List<AtaoUser> selectByExample(AtaoUserExample example);

    AtaoUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") AtaoUser record, @Param("example") AtaoUserExample example);

    int updateByExample(@Param("record") AtaoUser record, @Param("example") AtaoUserExample example);

    int updateByPrimaryKeySelective(AtaoUser record);

    int updateByPrimaryKey(AtaoUser record);
}