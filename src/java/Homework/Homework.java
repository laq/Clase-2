/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework;

/**
 *
 * @author usuario
 */
public class Homework {
    private static int  idCounter =1;
    private int id;
    private int grade;
    private String name;
    private String folder;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homework pr = new Homework(4,"Agenda App", "/folder");
        System.out.println(pr);
        
    }

    public Homework(int grade, String name, String folder) {
        this.grade = grade;
        this.name = name;
        this.folder = folder;
        this.id = idCounter++;
    }
    
    

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the folder
     */
    public String getFolder() {
        return folder;
    }

    /**
     * @param folder the folder to set
     */
    public void setFolder(String folder) {
        this.folder = folder;
    }

    @Override
    public String toString() {
        return name+":"+grade+" "+folder;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
