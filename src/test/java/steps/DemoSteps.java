package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoSteps {
    private  String test = "";
    @When("I hit the test method")
    public void iHitTheTestMethod() {
        test = "Hello";
    }

    @Then("I should receive {string}")
    public void iShouldReceive(String arg0) {
        Assert.assertEquals(test, arg0);
    }
}
