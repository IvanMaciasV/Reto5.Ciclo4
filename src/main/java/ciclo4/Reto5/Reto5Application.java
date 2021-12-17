package ciclo4.Reto5;


import ciclo4.Reto5.model.CleaningProduct;
import ciclo4.Reto5.model.Order;
import ciclo4.Reto5.model.User;
import ciclo4.Reto5.repository.OrderRepository;
import ciclo4.Reto5.repository.UserRepository;
import ciclo4.Reto5.repository.crud.CleaningCrudProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import ciclo4.Reto5.repository.crud.OrderCrudRepository;
import ciclo4.Reto5.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Reto5Application implements CommandLineRunner{

	@Autowired
	private CleaningCrudProductRepository crudRepository;
	@Autowired
	private UserCrudRepository userCrudRepository;
	@Autowired
	private OrderCrudRepository orderCrudRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private MongoTemplate mongoTemplate;
	public static void main(String[] args) {
		SpringApplication.run(Reto5Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		crudRepository.deleteAll();
		userCrudRepository.deleteAll();
		orderCrudRepository.deleteAll();
	}
}
