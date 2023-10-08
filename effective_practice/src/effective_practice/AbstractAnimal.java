package effective_practice;

public abstract class AbstractAnimal implements Animal {

	
    @Override
    public void speak() {
        System.out.println("동물이 말을 합니다.");
    }

    public abstract void eat();
	
}
