import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class MyStepdefs {
    private GeneratorPatternJava generatorPatternJava;
    private String finalText;
    @Given("^createObjectGeneratorPatternsJava$")
    public void createobjectgeneratorpatternsjava() {
        generatorPatternJava = new GeneratorPatternJAva();

    }

    @When("^callMethodcreateSingleton$")
    public void callmethodcreatesingleton() {
        finalText = generatorPatternJava.createSingleton();
    }

    @Then("^hisReturnString$")
    public void hisreturnstring() {
        assertTrue(finalText != null);
    }
}