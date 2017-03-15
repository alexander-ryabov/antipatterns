package suite.lazyclass.sample2;

public class NotLazyClass extends BaseClass{

    @Override
    public void method1() {
        System.err.println("Method 1 isn't implemented");
    }

    @Override
    public void method2() {
        System.err.println("Method 2 isn't implemented");
    }
}
