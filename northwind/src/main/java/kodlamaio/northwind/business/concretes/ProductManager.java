package kodlamaio.northwind.business.concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.api.controllers.DataResult;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResults;
//import kodlamaio.northwind.core.utilities.results.Result;
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



	@Override
	public DataResults<Product> getByProductName(String productName) {
		return new SuccesDataResult<Product>
		(this.productDao.getByProductName(productName),"Data listelendi");
	}



	@Override
	public DataResults<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		//business codes
		
		return new SuccesDataResult<Product>
		(this.productDao.getByProductNameAndCategory(productName,categoryId),"Data listelendi");
	}



	@Override
	public DataResults<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByProductNameOrCategory(productName,categoryId),"Data listelendi");
	}



	@Override
	public DataResults<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByCategoryIn(categories),"Data listelendi");
	}



	@Override
	public DataResults<List<Product>> getByProductNameContains(String productName) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByProductNameContains(productName),"Data listelendi");
	}



	@Override
	public DataResults<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByProductNameStartsWith(productName),"Data listelendi");
	}



	@Override
	public DataResults<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByNameAndCategory(productName,categoryId),"Data listelendi");
	}



	@Override
	public DataResult<List<Product>> getAllSorted() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
}
