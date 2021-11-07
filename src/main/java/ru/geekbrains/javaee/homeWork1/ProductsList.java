package ru.geekbrains.javaee.homeWork1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.javaee.homeWork1.model.Product;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "products", urlPatterns = {"/products"})

public class ProductsList extends HttpServlet {
	private static Logger logger = LoggerFactory.getLogger(ProductsList.class);
	private List<Product> productList = new ArrayList<>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		initProductList();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("products",productList);
		req.getRequestDispatcher("/products.jsp").forward(req, resp);
	}

	void initProductList() {
		logger.info("Log: Product list init");
		long id = 0L;
		productList.add(new Product(id++,"Apple",10));
		productList.add(new Product(id++,"Watermelon",8));
		productList.add(new Product(id++,"Banana",6));
		productList.add(new Product(id++,"Orange",12));
		productList.add(new Product(id++,"Lemon",13));
		productList.add(new Product(id++,"Dragon fruit",20));
		productList.add(new Product(id++,"Blueberries",15));
		productList.add(new Product(id++,"Raspberry",21));
		productList.add(new Product(id++,"Strawberry",18));
		productList.add(new Product(id++,"Blackberry",17));
	}
}
