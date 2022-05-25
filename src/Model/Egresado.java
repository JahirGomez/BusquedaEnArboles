package Model;

public class Egresado implements Comparable <Egresado> {
    public String name;
    public String profesion;
    public int grade;

    public Egresado(String name, String profesion, int grade) {
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

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    
    @Override
    public int compareTo(Egresado o) {
        return ((Integer.valueOf(this.getName()))-(Integer.valueOf(o.getName())));
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", profesion='" + getProfesion() + "'" +
            ", grade='" + getGrade() + "'" +
            "}";
    }


}
