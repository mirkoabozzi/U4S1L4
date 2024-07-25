package Esercitazione;

import enums.DepartmentValue;

public class Dipendente {
    //Attributi
    private int matricola;
    private double stipendio;
    private DepartmentValue departmentValue;


    //Costruttore
    public Dipendente(int matricola, double stipendio, DepartmentValue departmentValue) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.departmentValue = departmentValue;

        //System.out.println(matricola);
        //System.out.println(stipendio);
        //System.out.println(departmentValue);

    }

    //Getter & Setter
    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public DepartmentValue getDepartmentValue() {
        return departmentValue;
    }

    public void setDepartmentValue(DepartmentValue departmentValue) {
        this.departmentValue = departmentValue;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", departmentValue=" + departmentValue +
                '}';
    }
}
