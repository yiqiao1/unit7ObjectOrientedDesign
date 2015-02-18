import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Comparable<Person>
{
    private String name;

    /**
     * Default constructor for objects of class Person
     */
    public Person(String n)
    {
        this.name = n;
    }

    public String getName()
    {
        return name;
    }
    
    public int compareTo(Person other)
    
    {
        return this.name.compareTo(other.name);
    }
    
    public static Person firstPerson(ArrayList<Person> people)
    {
        Person first = people.get(0);
        
        for (int i = 1; i < people.size(); i++)
        {
            if (people.get(i).compareTo(first) < 0)
            {
                first = people.get(i);
            }
        }
    
        return first;
    }
    
    public static Person lastPerson(ArrayList<Person> people)
    {
        Person last = people.get(0);
        
        for (int i = 1; i < people.size(); i++)
        {
            if (people.get(i).compareTo(last) > 0)
            {
                last = people.get(i);
            }
        }
    
        return last;
    }

    public static void main(String[] args)
    {
        ArrayList<Person> people= new ArrayList<Person>();
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.print("\nPlease enter a name: ");
            Scanner in = new Scanner(System.in);
            Person person = new Person(in.next());
            people.add(person);
        }
        
        System.out.println("First person: " + firstPerson(people).name + "\nLast person: " + lastPerson(people).name);
    }
}
