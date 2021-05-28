package kodlamaio.northwind.business.abstracts;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.api.controllers.DataResult;
import kodlamaio.northwind.core.utilities.results.DataResults;
import kodlamaio.northwind.core.utilities.results.SuccesResult;
import kodlamaio.northwind.entities.concretes.Product;


public interface ProductService {
	DataResults<List<Product>> getAll();
	DataResult<List<Product>> getAllSorted();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
	SuccesResult add(Product product);
	
	DataResults<Product> getByProductName(String productName);

	DataResults<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResults<List<Product>>getByProductNameOrCategoryId(String productName, int categoryId);
	
	DataResults<List<Product>> getByCategoryIdIn(List<Integer> categories);
	
	DataResults<List<Product>> getByProductNameContains(String productName);
	
	DataResults<List<Product>> getByProductNameStartsWith(String productName);
	//select * form products where category_id in(1,2,3,4)
	
	DataResults<List<Product>> getByNameAndCategory(String productName, int categoryId);
}
 