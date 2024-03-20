import javax.swing.text.Style;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Supplier<Human> humanFactory = () -> {

            System.out.println("Input name:");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Input age:");
            int age = new Scanner(System.in).nextInt();
            System.out.println("Input height:");
            double height = new Scanner(System.in).nextDouble();
            return new Human(name, age, height);
        };

        Human human1 = humanFactory.get();
        Human human2 = humanFactory.get();
        System.out.println(human1);
        System.out.println(human2);

        Predicate<Integer>isAdult = (age) -> age >= 18;{
            System.out.println(human1.getName() + (isAdult.test(human1.getAge())?"adult":"child"));
            System.out.println(human2.getName() + " is adult: " + isAdult.test(human2.getAge()));
        }


    }
}