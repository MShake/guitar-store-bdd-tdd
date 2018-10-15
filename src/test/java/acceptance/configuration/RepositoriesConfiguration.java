package acceptance.configuration;

import com.devrider.study.adapters.InMemoryCustomerRepository;
import com.devrider.study.domain.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RepositoriesConfiguration {

    @Bean
    @Scope("cucumber-glue")
    public CustomerRepository customerRepository() {
        return new InMemoryCustomerRepository();
    }
}
