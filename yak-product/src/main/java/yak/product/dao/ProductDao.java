package yak.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import yak.product.entity.ProductEntity;

@Mapper
public interface ProductDao {
	
	public ProductEntity findProductByCode(String code);

	public List<ProductEntity> queryProductList();
	
}
