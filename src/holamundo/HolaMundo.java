/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");// TODO code application logic here
        Person p1;
        p1 = new Person("Jose Miguel", "Calvo", new Date(93,10,6));
        System.out.println(p1.getBirthday());
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());

    }
}
