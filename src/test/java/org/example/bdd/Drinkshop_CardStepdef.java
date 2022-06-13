package org.example.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CardMember;
import org.example.DrinkMenu;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Drinkshop_CardStepdef {
    CardMember cust;
    private int q;

    @Given(": the following are the drinks available:")
    public void the_following_are_the_drinks_available(List<Map<String,Integer>> drinksavailable) {
   drinksavailable.stream().forEach(
           davailable->
           {
               String drinks = String.valueOf(davailable.get("Drinks"));
               Integer price = davailable.get("Price");
               Integer quantity = davailable.get("Quantity");

               DrinkMenu drinkmenu=new DrinkMenu();
               drinkmenu.addDrinks(drinks,price);
           }
               );
    }
    @Given("^(.*) is a part of regular card program$")
    public void customer_is_a_part_of_regular_card_program(String name) {
      cust=new CardMember();
     cust.addname(name);

    }
    @When("^(.*) purchases (.*) of (\\d+) drinks?")
    public void customer_purchases_blueberry_of(String name,String drinkname,Integer cost) {
  cust.addorders(drinkname,cost);
    }
    @Then("they should get {int} cost")
    public void they_should_get(Integer expected_value) {
    assertEquals(expected_value,cust.getquantity(q));
    }
}
