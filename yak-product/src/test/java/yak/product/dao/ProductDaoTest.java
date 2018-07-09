//package yak.product.dao;
//
//import java.util.List;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import yak.product.entity.ProductEntity;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ProductDaoTest {
//	
//	@Autowired
//	private ProductDao productDao;
//	
//	@Test
//	public void findProductByCode(){
//		ProductEntity product = this.productDao.findProductByCode("A0B0001");
//		if(product!=null){
//			System.out.println("product.getName() = "+product.getName());
//		}
//	}
//	
//	@Test
//	public void queryProductList(){
//		List<ProductEntity> list = this.productDao.queryProductList();
//		if(list!=null){
//			System.out.println("productList.size() = "+list.size());
//		}
//	}
//
//}
