import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class MyStepdefs {
    private GeneratorPatternJava generatorPatternJava;
    private String finalText;
    @Given("^createObjectGeneratorPatternsJava$")
    public void createobjectgeneratorpatternsjava() {
        generatorPatternJava = new GeneratorPatternJava();
    }

    @When("^callMethodcreateSingleton$")
    public void callmethodcreatesingleton() {
        finalText = generatorPatternJava.createSingleton();
    }

    @Then("^hisReturnString$")
    public void hisreturnstring() {
        assertNotNull(finalText);
    }

    @Then("^hisReturnStringWithCodeSingleton$")
    public void hisreturnstringwithcodesingleton() {
        String string = " class Singleton {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        assertTrue(string.equals(finalText));
    }

    @When("^callMethodcreateSingletonWithA$")
    public void callmethodcreatesingletonwitha() {
        finalText = generatorPatternJava.createSingleton("A");
    }

    @Then("^hisReturnStringSingletonA$")
    public void hisreturnstringsingletona() {
        assertNotNull(finalText);
    }

    @Then("^hisReturnStringWithRightCodeSingletonA$")
    public void hisreturnstringwithrightcodesingletona() {
        String string = " class A {\n" +
                "    private static A instance;\n" +
                "    private A() {}\n" +
                "    public static A getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new A();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        assertTrue(string.equals(finalText));
    }

    @When("^callMethodcreateSingletonWithSingleton$")
    public void callmethodcreatesingletonwithsingleton() {
        finalText = generatorPatternJava.createSingleton("Singleton");

    }

    @Then("^hisReturnStringWithRightCodeSingletonSingleton$")
    public void hisreturnstringwithrightcodesingletonsingleton() {
        String string = " class Singleton {\n" +
                "    private static Singleton instance;\n" +
                "    private Singleton() {}\n" +
                "    public static Singleton getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Singleton();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        assertTrue(string.equals(finalText));
    }

    @When("^callMethodcreateSingletonWithYES$")
    public void callmethodcreatesingletonwithyes() {
        finalText = generatorPatternJava.createSingleton("YES");
    }

    @Then("^hisReturnStringWithRightCodeSingletonYES$")
    public void hisreturnstringwithrightcodesingletonyes() {
        String string = " class YES {\n" +
                "    private static YES instance;\n" +
                "    private YES() {}\n" +
                "    public static YES getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new YES();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        assertTrue(string.equals(finalText));
    }

    @When("^callMethodcreateSingletonWithServer$")
    public void callmethodcreatesingletonwithserver() {
        finalText = generatorPatternJava.createSingleton("Server");
    }

    @Then("^hisReturnStringWithRightCodeSingletonServer$")
    public void hisreturnstringwithrightcodesingletonserver() {
        String string = " class Server {\n" +
                "    private static Server instance;\n" +
                "    private Server() {}\n" +
                "    public static Server getInstance() {\n" +
                "        if (instance == null) {\n" +
                "            instance = new Server();\n" +
                "        }\n" +
                "        return instance;\n" +
                "    }\n" +
                "} ";
        assertTrue(string.equals(finalText));
    }
}