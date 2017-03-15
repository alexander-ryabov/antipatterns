package testsuite.lazyclass.sample2;

public class App2 {

    BaseClass iAmNotLazy = new NotLazyClass();

    public static void main(String[] args) {
        System.out.println("Lazy class anti-pattern");
    }

}
