/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;

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
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1993,9,6);
        p1 = new Person("Jose Miguel", "Calvo", f1);
        System.out.println(p1.getBirthday());
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());

    }
}
