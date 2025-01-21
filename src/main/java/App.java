import com.example.spring.PaymentProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PaymentProcessor manager = context.getBean("paymentProcessor", PaymentProcessor.class);

         manager.handlePayment("John Doe", 190120.25);
    }
}
