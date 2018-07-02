package yak.product.feign;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;

/**
 *价格服务降级处理
 */
@Slf4j
public class PriceFeignFallback implements PriceFeign {
    
	@Override
    public BigDecimal getPriceByProductCode(String productCode) {
        // log.info("执行降级逻辑开始...");
        return BigDecimal.valueOf(0);
    }
    
}
