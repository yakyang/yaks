package yak.product.feign;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 获取价格服务信息
 */
@Service
@FeignClient(value = "yak-price",fallback = PriceFeignFallback.class)  //name属性表示请求微服务
public interface PriceFeign {

    /**
     * 根据productcode获取价格信息
     * @param productCode 商品编码
     * @return 商品价格
     */
    @PostMapping("/api/price/getPriceByProductCode/{productCode}")
    public BigDecimal getPriceByProductCode(@PathVariable("productCode")  String productCode);
    
}
