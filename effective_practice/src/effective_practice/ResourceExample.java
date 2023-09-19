package effective_practice;

public class ResourceExample {

	public static void main(String[] args) {

		// 사용한 경우
        try (Resource resource = new Resource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.err.println("예외가 발생했습니다: " + e.getMessage());
        }

        // 사용하지 않은 경우
        Resource resource2 = new Resource();
        resource2.doSomething();
        resource2.close();
		
	}

}

class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("Resource가 열렸습니다.");
    }

    public void doSomething() {
        System.out.println("Resource를 사용합니다.");
    }

    @Override
    public void close() {
        System.out.println("Resource가 닫혔습니다.");
    }
}