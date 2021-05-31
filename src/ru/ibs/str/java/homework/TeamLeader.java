package ru.ibs.str.java.homework;

public class TeamLeader extends Employee implements Manager{

    private String experience;
    private String nameProject;

    public TeamLeader(String name, int id, String direction) {
        super(name, id, direction);
    }

    @Override
    public void debag() {

    }

    public TeamLeader(String name, int id, String direction, String experience, String nameProject) {
        super(name, id, direction);
        this.experience = experience;
        this.nameProject = nameProject;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    @Override
    public void motivation() {
        System.out.println("Помогаю каждому разобрать их ошибки");
    }

    public void Plan() {
        System.out.println("Составляю план разработки");
    }
}
