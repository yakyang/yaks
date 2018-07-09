package yak.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan({"yak.price"})
public class YakPriceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(YakPriceApplication.class, args);
	}

}
