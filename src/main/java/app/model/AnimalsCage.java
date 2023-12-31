package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    @Qualifier("dog")

    private Animal animal;
    private Timer nanoTime;

    public AnimalsCage(Timer nanoTime) {
        this.nanoTime = nanoTime;
    }
    public Timer getTimer() {
       return nanoTime;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(nanoTime.getTime());
        System.out.println("________________________");
    }


}
