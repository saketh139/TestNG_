import org.testng.annotations.*;

public class Demo4 {
    @AfterClass
    public void Apple() {
        System.out.println("apple code");
    }

    @AfterTest
    public void Microsoft() {
        System.out.println("microsoft code");
    }

    @Test
    public void Sony() {
        System.out.println("sony code");
    }

    @BeforeTest
    public void Lenovo() {
        System.out.println("lenovo code");
    }
}
