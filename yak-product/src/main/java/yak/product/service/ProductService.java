package yak.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yak.product.dao.ProductDao;
import yak.product.entity.ProductEntity;
import yak.product.feign.PriceFeign;
import yak.product.vo.ProductVo;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private PriceFeign priceFeign; // 注入feign接口调用模板

	/**
	 * 获取商品列表
	 * 
	 * @return
	 */
	public List<ProductVo> queryProductList() {
		List<ProductVo> list = new ArrayList<ProductVo>();
		List<ProductEntity> productEntitys = this.productDao.queryProductList();
		for (ProductEntity product : productEntitys) {
			ProductVo vo = new ProductVo();
			vo.setCode(product.getCode());
			vo.setName(product.getName());
			vo.setPrice(priceFeign.getPriceByProductCode(""));
			list.add(vo);
		}
		return list;
	}

}
