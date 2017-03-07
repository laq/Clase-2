/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class HomeworkList {
    
    public static List<Homework> list = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        list.add(new Homework(2, "a", "one"));
        list.add(new Homework(3, "b", "other"));
        
        System.out.println(list);
        
        System.out.println("found:"+search(2));
    }
    
    public static Homework search(int id){
        Homework found = null;
        for (Homework homework : list) {
            if(homework.getId()==id){
                found = homework;
                break;
            }
        }
        return found;
    }
    
}
