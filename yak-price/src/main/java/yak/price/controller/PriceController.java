package yak.price.controller;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/price")
public class PriceController {


    /**
     * 获取商品列表
     * @return
     */   
    @RequestMapping(value = "/getPriceByProductCode/{productCode}", method = RequestMethod.GET)
    public BigDecimal getProductPriceInfo(@PathVariable("productCode") String productCode) {

        return  BigDecimal.valueOf(20.00);

    }

}
