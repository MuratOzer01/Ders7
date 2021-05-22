package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResults;
import kodlamaio.northwind.core.utilities.results.SuccesResult;
import kodlamaio.northwind.entities.concretes.Product;


public interface ProductService {
	DataResults<List<Product>> getAll();
	SuccesResult add(Product product);
}
 