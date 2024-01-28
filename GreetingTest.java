//this program is created just to demonstrate how ci/cd works 
import org.junit.Test;
import static org.junit.Assert.*;

public class GreetingTest {

    @Test
    public void testSayHello() {
        Greeting greeting = new Greeting();
        assertEquals("Hello, world!", greeting.sayHello());
    }
}
