import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class StockSteps implements En {
    public StockSteps() {
        And("^\"([^\"]*)\" is in number of \"([^\"]*)\" in the stock$", (String guitarModel, String guitarStock) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        And("^the \"([^\"]*)\" is now in number of \"([^\"]*)\" in the stock$", (String guitarModel, String guitarStock) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
