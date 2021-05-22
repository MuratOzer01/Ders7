package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResults;
import kodlamaio.northwind.core.utilities.results.SuccesDataResult;
import kodlamaio.northwind.core.utilities.results.SuccesResult;
import kodlamaio.northwind.dataAcces.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;


@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}



	@Override
	public DataResults<List<Product>> getAll() {
		
		return new SuccesDataResult<List<Product>>
		(this.productDao.findAll(),"Data listelendi");
		
		
	}



	@Override
	public SuccesResult add(Product product) {
		this.productDao.save(product);
		return new SuccesResult("Ürün Eklendi");
	}
}
