package acceptance;

import com.devrider.study.domain.Customer;
import com.devrider.study.domain.CustomerRepository;
import cucumber.api.DataTable;
import cucumber.api.java8.En;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CustomerSteps implements En {
    public CustomerSteps(CustomerRepository customerRepository) {
        Given("^clients exist:$", (DataTable dataTable) -> {
           List<Map<String, String>> dataMaps = dataTable.asMaps(String.class, String.class);
           dataMaps.forEach((dataMap) -> {
               Customer customer = new Customer(dataMap.get("id"), dataMap.get("firstName"), dataMap.get("lastName"));
               customerRepository.add(customer);
               assertEquals(customer, customerRepository.all());
           });

        });
    }
}
