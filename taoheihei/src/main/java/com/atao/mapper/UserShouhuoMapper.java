package com.atao.mapper;

import com.atao.po.UserShouhuo;
import com.atao.po.UserShouhuoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShouhuoMapper {
    int countByExample(UserShouhuoExample example);

    int deleteByExample(UserShouhuoExample example);

    int insert(UserShouhuo record);

    int insertSelective(UserShouhuo record);

    List<UserShouhuo> selectByExample(UserShouhuoExample example);

    int updateByExampleSelective(@Param("record") UserShouhuo record, @Param("example") UserShouhuoExample example);

    int updateByExample(@Param("record") UserShouhuo record, @Param("example") UserShouhuoExample example);
}