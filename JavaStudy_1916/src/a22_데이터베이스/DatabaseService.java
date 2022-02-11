package a22_데이터베이스;

import java.util.ArrayList;
import java.util.List;

import a22_데이터베이스.Dto.Product;
import a22_데이터베이스.Dto.User;
import db.DBConnectionMgr;

public class DatabaseService {

	public static void main(String[] args) {
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		
		UserDao userDao = new UserDao(pool);
		ProductDao productDao = new ProductDao(pool);
		
		User user1 = User.builder()
						.username("abc")
						.password("1234")
						.name("김준일")
						.email("skjil1218@gmail.com")
						.phone("010-9988-1916")
						.addr("부산 동래구")
						.build();
		
		//userDao.InserUser(user1);
		System.out.println(userDao.getUser("abc"));
		
///////////////////////////////////////////////////////////////////
		
		Product product = Product.builder()
							.product_name("아이스 아메리카노")
							.category_code(3)
							.build();
		
		List<Product> products = new ArrayList<Product>();
		products.add(product);
		products.add(product);
		products.add(product);
		products.add(product);
		products.add(product);
		
		//int insertCount = productDao.insertProducts(products);
		//System.out.println(insertCount);
		
		//int deleteCount = productDao.deleteProduct(5);
		//System.out.println(deleteCount);
		
		int updateCount = productDao.updateProductName(6, "자몽에이드");
		System.out.println(updateCount);
		
		//productDao.insertProduct(product);
		//System.out.println(productDao.getProduct(3));
	}

}
