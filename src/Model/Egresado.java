package Model;

import Model.arbol.NodoArbol;

public class Egresado extends NodoArbol {
    private String name;
    private String profesion;
    private String grade;

    public Egresado(String name, String profesion, String grade) {
        this.name = name;
        this.profesion = profesion;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
