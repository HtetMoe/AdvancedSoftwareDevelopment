package L2_ObserverPattern.OP1;

import L2_ObserverPattern.OP1.observer.ConcreteObserver1;
import L2_ObserverPattern.OP1.observer.ConcreteObserver2;
import L2_ObserverPattern.OP1.subject.ConcreteSubject;

//creating a subject and multiple observers, and changing the subject’s state.
public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState("one");
        subject.setState("two");

        //remove observer
        subject.removeObserver(observer1);
    }
}
