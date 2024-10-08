package com.louis.mall.rowmapper;

import com.louis.mall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {

        Product product = new Product();
        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));
        product.setCategory(resultSet.getString("category"));
        product.setImageUrl(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreatedDate((Data) resultSet.getTimestamp("created_date"));
        product.setLastModifiedDate((Data) resultSet.getTimestamp("last_modified_date"));
        return product;




    }
}
