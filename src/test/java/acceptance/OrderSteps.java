package acceptance;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.api.PendingException;

public class OrderSteps {
    @When("^I try to order a \"([^\"]*)\" which is \"([^\"]*)\"$")
    public void iTryToOrderAWhichIs(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the order is register$")
    public void theOrderIsRegister() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
