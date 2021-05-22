package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResults;
import kodlamaio.northwind.core.utilities.results.SuccesResult;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProdutcsController {
	
	
	private ProductService productService;
	
	@Autowired
	public ProdutcsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getall")
	public DataResults<List<Product>> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public SuccesResult add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	
}
