package entities;

import entities.interfaces.CheckIn;

import java.time.LocalDateTime;


public class Volontario implements CheckIn {
    private final String name;
    private final int age;
    private final String cv;

    public Volontario(String name, int age, String cv) {
        this.name = name;
        this.age = age;
        this.cv = cv;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCv() {
        return cv;
    }


    @Override
    public void ceckIn() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Volontario " + this.name + " checkin : " + now);
    }
}
