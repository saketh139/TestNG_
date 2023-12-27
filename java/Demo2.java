import org.testng.annotations.Test;

public class Demo2 {
    @Test()
    public void Apple(){
        System.out.println("apple code");
    }
    @Test(priority = 1)
    public void Microsoft(){
        System.out.println("microsoft code");
    }
    @Test()
    public void Sony(){
        System.out.println("sony code");
    }
    @Test(priority = 2)
    public void Lenovo() {
        System.out.println("lenovo code");
    }
}
