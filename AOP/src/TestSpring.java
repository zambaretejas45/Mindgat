import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.sky.aop.ApplicationService;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext beanfactory = new ClassPathXmlApplicationContext("spring.xml");
		 ApplicationService annoService = (ApplicationService) beanfactory.getBean(ApplicationService.class);
		System.out.println(annoService);
		 annoService.processApplication();
		 annoService.processApplicationWithAudit();
	}
}
