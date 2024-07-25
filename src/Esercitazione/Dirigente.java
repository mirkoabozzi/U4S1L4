package Esercitazione;

import enums.DepartmentValue;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola, double stipendio, DepartmentValue departmentValue) {
        super(matricola, stipendio, departmentValue);
    }

    @Override
    public void calculateSalary() {
        System.out.println("La matricola " + this.getMatricola() + " guadagna " + this.getStipendio());
    }


}
