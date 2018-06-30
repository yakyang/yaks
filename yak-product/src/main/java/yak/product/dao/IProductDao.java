package yak.product.dao;

import org.apache.ibatis.annotations.Mapper;
import yak.product.entity.ProductEntity;

@Mapper
public interface IProductDao {
	
	public ProductEntity findProductByCode(String code);

}
