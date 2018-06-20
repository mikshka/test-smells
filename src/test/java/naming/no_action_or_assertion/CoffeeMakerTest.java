package naming.no_action_or_assertion;

import coffee.CoffeeMaker;
import coffee.Heater;
import coffee.Pump;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import sample.Bad;
import sample.Good;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static utils.SystemOutMatcher.has;

@RunWith(MockitoJUnitRunner.class)
public class CoffeeMakerTest {
    @Mock private Heater heater;
    @Mock private Pump pump;

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private CoffeeMaker coffeeMaker;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(output));
        coffeeMaker = new CoffeeMaker(heater, pump);
    }

    /**
     * It is not clear what action is performed and what is being checked.
     */
    @Bad
    @Test public void testCoffeeMaker() {
        coffeeMaker.brew();
        assertThat(output, has(CoffeeMaker.COFFEE));
    }

    @Good
    @Test public void shouldMakeCoffee() {
        coffeeMaker.brew();
        assertThat(output, has(CoffeeMaker.COFFEE));
    }

    @Good
    @Test public void brew_makesCoffee() {
        coffeeMaker.brew();
        assertThat(output, has(CoffeeMaker.COFFEE));
    }

}