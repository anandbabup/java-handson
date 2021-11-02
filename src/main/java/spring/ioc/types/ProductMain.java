package spring.ioc.types;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {
    public static void main(String[] arg){
    	
    	//1. Intanstantiate the spring ioc container
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	// 2.Get bean information from spring ioc
    	Product product = applicationContext.getBean("product1",Product.class);
    	
    	//3. use the bean
    	System.out.println(product);

    }
}
