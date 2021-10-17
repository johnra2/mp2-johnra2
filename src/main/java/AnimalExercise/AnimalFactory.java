package AnimalExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalFactory {

    public static Animal create(AnimalType type) {
        Animal a;
        switch (type) {
            case Cat:
                a = new Cat();
                a.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
                break;
            case Dog:
                a = new Dog();
                a.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
                break;
            case Duck:
                a = new Duck();
                a.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
                break;
            default:
                a = new Cow();
                a.setAge(Integer.parseInt((new SimpleDateFormat("dd")).format(new Date())));
                break;
        }
        return a;
    }
}
