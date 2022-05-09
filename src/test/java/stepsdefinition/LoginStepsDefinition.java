package stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepsDefinition {

    @Given("a {word} wants to purchase some products")
    public void thatAMobileAppUserWantsToManageTheirAccount(String actor) {
        theActorCalled(actor).entersTheScene();
    }

    @When("client login the app$")
    public void theUserTypesTheirUsernameMobileAppComAndItsPassword() {
        theActorInTheSpotlight().attemptsTo(Login.usingValidUser("standard_user"));
    }

    @Then("client must be able to see the product list")
    public void theUserMustSeeTheControlPanel() {
        //TODO Just create an awesome assertion
        theActorInTheSpotlight().attemptsTo();
    }
}