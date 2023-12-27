import org.testng.annotations.Test;

public class Demo1 {
    @Test()
    public void Apple(){
        System.out.println("apple code");
    }
    @Test(dependsOnMethods = "Apple")
    public void Microsoft(){
        System.out.println("microsoft code");
    }
    @Test()
    public void Sony(){
        System.out.println("sony code");
    }
    @Test(dependsOnMethods = "Sony")
    public void Lenovo(){
        System.out.println("lenovo code");
    }
}
