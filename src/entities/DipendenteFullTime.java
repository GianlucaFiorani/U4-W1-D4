package entities;

import entities.enums.Dipartimento;

import java.time.LocalDateTime;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return this.stipendio / 160;
    }

    @Override
    public void ceckIn() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dipendente full-time " + this.getMatricola() + " checkin : " + now);
    }
}
