package com.springboot.k8s.DockerK8S;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzStepdefs {

    FizzBuzz fizzBuzz;
    String result;

    @Given("^Create a fizzbuzz game$")
    public void createAFizzbuzzGame() throws Throwable{
        fizzBuzz=new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int arg0) throws Throwable{
       result= fizzBuzz.fizzbuzz(arg0);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String theResultString) throws Throwable {
        Assertions.assertEquals(result,theResultString);
    }


}
