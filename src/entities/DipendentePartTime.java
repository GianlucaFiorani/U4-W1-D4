package entities;

import entities.enums.Dipartimento;

import java.time.LocalDateTime;

public class DipendentePartTime extends Dipendente {
    private int hour;

    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, int hour) {
        super(matricola, stipendio, dipartimento);
        this.hour = hour;
    }

    @Override
    public double calculateSalary() {
        return this.stipendio / this.hour;
    }

    @Override
    public void ceckIn() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dipendente part-time " + this.getMatricola() + " checkin : " + now);
    }
}
