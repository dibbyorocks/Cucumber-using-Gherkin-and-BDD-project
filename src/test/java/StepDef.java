import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Drinkshop;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDef {
      Drinkshop drinkshop;
      int value;
      int am;
    @Given("Customer is a part of regular card")
    public void customer_is_a_part_of_regular_card() {
           drinkshop = new Drinkshop();
        // Write code here that turns the phrase above into concrete actions

    }

    @When("he orders  {int} drink of price {int}")
    public void he_orders_drink_of_price(int noofdrinks, int price) {
        // Write code here that turns the phrase above into concrete actions
        value=drinkshop.gettotalamount(noofdrinks,price);
    }
    @Then("it should return the total amount {int}")
    public void it_should_return_the_total_amount(int expected) {
        // Write code here that turns the phrase above into concrete actions
       assertEquals(expected,value);
    }

    @When("he order {int} drinks of each price {int}")
    public void he_order_drinks_of_each_price(int c,int p) {
       am=drinkshop.getcount(c,p);
    }
    @Then("the total amount is {int}")
    public void the_total_amount_is(int expected_value) {
        assertEquals(expected_value,am);
    }


}
