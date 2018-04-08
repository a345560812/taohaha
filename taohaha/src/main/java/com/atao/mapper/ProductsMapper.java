package com.atao.mapper;

import com.atao.po.Products;
import com.atao.po.ProductsExample;
import com.atao.util.SearchProduct;
import com.atao.util.SearchResult;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsMapper {
    int countByExample(ProductsExample example);

    int deleteByExample(ProductsExample example);

    int deleteByPrimaryKey(Long productId);

    int insert(Products record);

    int insertSelective(Products record);

    List<Products> selectByExample(ProductsExample example);

    Products selectByPrimaryKey(Long productId);

    int updateByExampleSelective(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByExample(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKey(Products record);

	SearchProduct getProductById(Long productId);
	SearchResult getProductById1(Long productId);
}