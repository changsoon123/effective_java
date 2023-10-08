package effective_practice;

public class Dog extends AbstractAnimal {

    @Override
    public void eat() {
        System.out.println("강아지가 뼈다귀를 먹습니다.");
    }
	
    public static void main(String[] args) {
    	 
    	Animal dog = new Dog();
         Animal cat = new Cat();

         dog.speak();
         dog.eat();

         cat.speak();
         cat.eat();
    	
    }
    
}

class Cat extends AbstractAnimal {
    @Override
    public void eat() {
        System.out.println("고양이가 생선을 먹습니다.");
    }
}