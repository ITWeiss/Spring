import com.example.spring.PaymentProcessor;
import com.example.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

//        Загрузка контекста из XML файла
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PaymentProcessor manager = context.getBean("paymentProcessor", PaymentProcessor.class);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentProcessor manager = context.getBean(PaymentProcessor.class);

        manager.handlePayment("John Doe", 190120.25);
    }
}
