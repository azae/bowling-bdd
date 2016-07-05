package net.azae.kata;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BowlingGameAnnotedScenario {
    private Game game;

    @Given("^a new bowling game$")
    public void createGame() {
        game = new Game();
    }

    @When("^all of my balls are landing in the gutter$")
    public void allOfMyBallsAreLandingInTheGutter() {
        for (int i = 0; i < 20; i++)
            game.roll(0);
    }

    @Then("my score should be (\\d+)$")
    public void myScoreShouldBe(int score) {
        Assert.assertEquals(score, game.score());
    }
}
