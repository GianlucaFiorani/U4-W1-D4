package entities;

import entities.enums.Dipartimento;

import java.time.LocalDateTime;

public class Dirigente extends Dipendente {
    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return this.stipendio / 140;
    }

    @Override
    public void ceckIn() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dirigente " + this.getMatricola() + " checkin : " + now);
    }
}
