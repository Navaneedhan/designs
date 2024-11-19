package strategy.pattern;

public class CityQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("City quack");
    }
}
