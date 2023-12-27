import org.testng.annotations.Test;

public class Demo3 {
    @Test(enabled = false)
    public void Apple() {
        System.out.println("apple code");
    }

    @Test()
    public void Microsoft() {
        System.out.println("microsoft code");
    }

    @Test(enabled = false)
    public void Sony() {
        System.out.println("sony code");
    }

    @Test()
    public void Lenovo() {
        System.out.println("lenovo code");
    }
}
