package yak.price.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import yak.price.entity.PriceEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PriceDaoTest {
	
	@Autowired
	private IPriceDao priceDao;
	
	@Test
	public void findPriceByProductCode(){
		PriceEntity price = this.priceDao.findPriceByProductCode("A0B0001");
		if(price!=null){
			System.out.println("price.getPrice() = "+price.getPrice());
		}
	}

}
