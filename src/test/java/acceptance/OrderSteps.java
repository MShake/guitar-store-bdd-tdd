package acceptance;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class OrderSteps implements En {
    public OrderSteps() {
        When("^I try to order a \"([^\"]*)\" which is \"([^\"]*)\"$", (String guitarModel, String availability) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^the order is register$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
