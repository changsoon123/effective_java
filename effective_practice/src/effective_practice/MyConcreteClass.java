package effective_practice;

public abstract class MyConcreteClass implements MyInterface{

	private final MyHelper helper = new MyHelper();

    @Override
    public void myMethod1() {
        helper.myMethod1();
    }

    @Override
    public void myMethod2() {
        helper.myMethod2();
    }

    private class MyHelper {
        public void myMethod1() {
        }

        public void myMethod2() {
        }
    }
	
}
