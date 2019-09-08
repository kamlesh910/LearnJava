
public class Student
{
	private String name;
	private int age;
	private String gender;
	private int id;
	private int contact;

	Student()
	{
		name="Noname";
		age=-1;
		gender="Undefined";
		id=-1;
		contact=-1;
	}



	//Student(1,24,"kama","male",2443);
	Student(int id,int a,String name,String gender,int contact)
	{
		this.id=id;	
		this.age=a;
		this.name=name;
		this.gender=gender;
		this.contact=contact;
	}


	public void setcontact(int contact)
	{
		this.contact=contact;
	}
	public int getcontact()
	{
		return contact;
	}

    public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
 
    public void setgender(String gender)
	{
		this.gender=gender;
	}
    
	public String getgender()
	{
		return gender;
	}
   
	public void setname(String name)
	{
	    this.name=name;
	}
    
	public String getname()
    {
	    return name;
    }

	public void setage(int age)
	{
	    this.age=age;	
    }	
	
	public int getage()
	{
		return age; 
	}

	public void printstud()
	{

        System.out.println("----------------");
		System.out.println(getid());
		System.out.println(getname());
		System.out.println(getcontact());
		System.out.println(getage());
		System.out.println(getgender());
		System.out.println("----------------");
	}

}
