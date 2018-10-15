import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class UserSteps implements En {
    public UserSteps() {
        Given("^I'm authenticated as \"([^\"]*)\"$", (String firstName) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
