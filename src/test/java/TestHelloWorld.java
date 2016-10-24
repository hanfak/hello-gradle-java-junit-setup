import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class TestHelloWorld {
    @Test 
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.printString());
    }
}