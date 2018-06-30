package yak.price.dao;

import org.apache.ibatis.annotations.Mapper;
import yak.price.entity.PriceEntity;

@Mapper
public interface IPriceDao {
	
	public PriceEntity findPriceByProductCode(String productCode);

}
