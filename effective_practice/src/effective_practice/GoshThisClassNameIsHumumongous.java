package effective_practice;

public class GoshThisClassNameIsHumumongous {

	public static void main(String[] args) {
		
        ServiceClass service = new ServiceClass();

        service.execute(GoshThisClassNameIsHumumongous::action);

        service.execute(() -> action());
        
    }

    public static void action() {
    	
        System.out.println("Action executed!");
        
    }
}

class ServiceClass {
    public void execute(Runnable action) {
    	
        action.run();
        
    }
}