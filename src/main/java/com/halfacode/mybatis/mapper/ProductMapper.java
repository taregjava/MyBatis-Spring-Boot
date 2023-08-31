package com.halfacode.mybatis.mapper;

import com.halfacode.mybatis.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM products")
    List<Product> findAll();

    @Select("SELECT * FROM products WHERE id = #{id}")
    Product findById(Long id);

    @Insert("INSERT INTO products(name, price) VALUES(#{name}, #{price})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Product product);

    @Update("UPDATE products SET name = #{name}, price = #{price} WHERE id = #{id}")
    void update(Product product);

    @Delete("DELETE FROM products WHERE id = #{id}")
    void delete(Long id);
}