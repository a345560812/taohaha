package com.atao.mapper;

import com.atao.po.Productsclass;
import com.atao.po.ProductsclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsclassMapper {
    int countByExample(ProductsclassExample example);

    int deleteByExample(ProductsclassExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Productsclass record);

    int insertSelective(Productsclass record);

    List<Productsclass> selectByExample(ProductsclassExample example);

    Productsclass selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Productsclass record, @Param("example") ProductsclassExample example);

    int updateByExample(@Param("record") Productsclass record, @Param("example") ProductsclassExample example);

    int updateByPrimaryKeySelective(Productsclass record);

    int updateByPrimaryKey(Productsclass record);

    List<Productsclass> selectlikeName(String typeName);
}