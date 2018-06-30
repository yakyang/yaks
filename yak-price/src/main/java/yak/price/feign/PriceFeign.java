//package yak.price.feign;
//
//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Service
//@FeignClient(value = "service-price",fallback = PriceFeignFallback.class)
//public interface PriceFeign {
//
//    /**
//     * 根据productcode获取价格信息
//     * @param productCode 商品编码
//     * @return 商品价格
//     */
//    @PostMapping("/api/price/getPriceByProductCode/{productCode}")
//    int getPriceByProductCode(@PathVariable("productCode")  String productCode);
//    
//}
