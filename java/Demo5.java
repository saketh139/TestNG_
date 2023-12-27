import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo5 {
    @Test()
    public void Apple() {
        System.out.println("apple code");
    }

    @BeforeClass
    public void Microsoft() {
        System.out.println("microsoft code");
    }

    @Test()
    public void Sony() {
        System.out.println("sony code");
    }

    @AfterMethod()
    public void Lenovo() {
        System.out.println("lenovo code");
    }
    @Test
    public void Dell(){
        System.out.println("dell code");
    }
}
