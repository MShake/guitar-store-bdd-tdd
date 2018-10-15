package acceptance;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class GuitarSteps implements En {
    public GuitarSteps() {
        Given("^guitars exist:$", (DataTable dataTable) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
