package effective_practice;

import java.util.EnumSet;

public class Practice_num1 {

	public static void main(String[] args) {
        Class<?> enumClass = MyEnum.class;
        System.out.println("Enum Class Name: " + enumClass.getName());
        
        EnumSet<MyEnum> myEnumSet = EnumSet.noneOf(MyEnum.class);
        
        System.out.println(myEnumSet);
    }

}

enum MyEnum {
    VALUE1,
    VALUE2,
    VALUE3
}