import entities.*;
import entities.enums.Dipartimento;
import entities.interfaces.CheckIn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new DipendenteFullTime("paolo123", 1500, Dipartimento.PRODUZIONE);
        Dipendente d2 = new DipendentePartTime("Azz567", 700, Dipartimento.VENDITE, 82);
        Dipendente d3 = new Dirigente("boss77", 9000, Dipartimento.AMMINISTRAZIONE);
        Volontario v1 = new Volontario("gigi", 35, "Sono bravo assumetemi");
        Volontario v2 = new Volontario("paola", 15, "Accetto lavoro sottopagato");
        Volontario v3 = new Volontario("JJ", 60, "Lavorato presso ...");

        Dipendente[] dipendenti = {d1, d2, d3};
        int salarySum = 0;
        for (int i = 0; i < dipendenti.length; i++) {
            salarySum += dipendenti[i].calculateSalary();
            System.out.println(dipendenti[i].getMatricola() + "stipendio ora" + dipendenti[i].calculateSalary());
            if (i == dipendenti.length - 1) {
                System.out.println("Salario totale orario :" + salarySum);
            }
        }


        CheckIn[] checkIns = {d1, d2, d3, v1, v2, v3};
        for (int i = 0; i < checkIns.length; i++) {
            checkIns[i].ceckIn();
        }
    }
}