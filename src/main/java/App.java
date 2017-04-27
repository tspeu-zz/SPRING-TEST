import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;


public class App {

	public static void main(String[] args) {
		
		CustomerService servicio = new CustomerServiceImpl();
		
		System.out.println(servicio.findAll().get(0).getFirstname());
		
		

	}

}
