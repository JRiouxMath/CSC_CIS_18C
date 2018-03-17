/**
 *
 * @author paulconrad
 */
public class Person implements Comparable {
    private String first_name;
    private String last_name;
    
    
    Person()
    {
        first_name="";
        last_name="";
    }
    
    Person(String fname, String lname)
    {
        this.setFirstName(fname);
        this.setLastName(lname);
    }
    
    public void setFirstName(String first)
    {
        this.first_name=first;
    }
    
    public void setLastName(String last)
    {
        this.last_name=last;
    }
    
    public String getFirstName()
    {
        return this.first_name;
    }
    
    public String getLastName()
    {
        return this.last_name;
    }
    
    // overloaded compareTo
    public int compareTo(Object b)
    {
        Person pb = (Person)b;
        return this.getLastName().compareTo(pb.getLastName());
    }
    
    @Override
    public String toString()
    {
        return this.getLastName()+", "+this.getFirstName();
    }
}
