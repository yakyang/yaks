package yak.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import yak.product.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	/**
     * 获取商品列表
     * @return
     */
    @GetMapping(value = "getProducts")
    @ResponseBody
    public Response getProducts() {
    	Response response = new Response("0000","成功");
    	response.setData(productService.queryProductList());
    	return response;
    }

}
