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
    private int nota;
    private String nombre;
    private String addresss;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homework pr = new Homework(4,"Agenta", "/tareas/agenda");
        System.out.println(pr);
        
    }

    public Homework(int nota, String nombre, String addresss) {
        this.nota = nota;
        this.nombre = nombre;
        this.addresss = addresss;
        this.id = idCounter++;
    }
    
    

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the addresss
     */
    public String getAddresss() {
        return addresss;
    }

    /**
     * @param addresss the addresss to set
     */
    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    @Override
    public String toString() {
        return nombre+":"+nota+" "+addresss;
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
