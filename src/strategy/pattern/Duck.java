package strategy.pattern;

public abstract class Duck {
    QuackBehavior quackBehavior;

    Duck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void quack() {
        quackBehavior.quack();
    }
}
