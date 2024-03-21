package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinitions
 {
   	@Given("^User is on NetBanking landing page$")
    public void userIsOnNetBankingLandingPage() throws Throwable
    {
    	System.out.println("Navigated Success");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLoginIntoApplicationWithAnd(String str1, String str2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	 System.out.println(str1);
         System.out.println(str2);
          
    }
    
    @Then("^Home page is populated$")
    public void homePageIsPopulated() throws Throwable
    {
    	System.out.println("Home page Success");
    }

    @And("^Cards are displayed are \"([^\"]*)\"$")
    public void cardsAreDisplayedAre(String arg0) throws Throwable {
    	
    	System.out.println(arg0);
    }
}
