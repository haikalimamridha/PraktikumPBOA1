
package pertemuan_10;

import java.io.*;
/**
 *
 * @author ThinkPad
 */


class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args){
        Person person = new Person("haikal");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis object person");
            s.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
