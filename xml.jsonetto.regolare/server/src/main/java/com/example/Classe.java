package com.example;

import java.util.ArrayList;

public class Classe {
    Integer anno;
    String sezione;
    String classe;
    ArrayList<Alunno> students = new ArrayList<>();
    public Classe(Integer anno, String sezione, String classe) {
        this.anno = anno;
        this.sezione = sezione;
        this.classe = classe;
    }
    public Integer getAnno() {
        return anno;
    }
    public void setAnno(Integer anno) {
        this.anno = anno;
    }
    public String getSezione() {
        return sezione;
    }
    public void setSezione(String sezione) {
        this.sezione = sezione;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public ArrayList<Alunno> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Alunno> students) {
        this.students = students;
    }
    public void addStudent(Alunno s) {
        this.students.add(s);
    }
    
}
