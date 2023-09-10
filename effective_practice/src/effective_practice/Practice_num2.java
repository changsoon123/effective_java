package effective_practice;

import java.util.EnumSet;
import java.util.Set;
import java.util.Objects;

public class Practice_num2 {

	public static void main(String[] args) {

		
		Pizza hawaiianPizza = new HawaiianPizzaBuilder()
	            .addTopping(Pizza.Topping.HAM)
//	            .addTopping(Pizza.Topping.PINEAPPLE)
	            .build();
		
		Set<Pizza.Topping> toppings = hawaiianPizza.getToppings();
	    System.out.println("Toppings: " + toppings);
	}

}

class Pizza {
	
    private final Set<Topping> toppings;

    public static abstract class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        protected abstract T self();

        public abstract Pizza build();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

    // 토핑 열거형
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    
    public Set<Topping> getToppings() {
        return toppings;
    }
}

class HawaiianPizzaBuilder extends Pizza.Builder<HawaiianPizzaBuilder> {
    @Override
    protected HawaiianPizzaBuilder self() {
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}