public class Book
{
    private String name;
    private int id;
    private String author;
    
    public String getauthor()
    {
        return author;
    }
    public void setauthor(String author)
    {
        this.author=author;
    }

    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    Book()
    {
        name ="undefined";
        id=-1;
        author="NA";
    }
    Book(int i,String n,String a)
    {
        this.id=i;
        this.name=n;
        this.author=a;
    }
    public void printbook()
	{

        System.out.println("----------------");
		System.out.println(getid());
		System.out.println(getname());
		System.out.println(getauthor());
        System.out.println("----------------");
        
	}
}