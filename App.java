

public class App
{
    public static void main(String[] args)
    {
        Student stud; //declaration
        
        stud=new Student(); //Intitiate
        //stud.setname("kanchan");
        stud.setcontact(1314);
        stud.setage(23);
        stud.setgender("female");
        stud.printstud();

        Student stud1= new Student();
        stud1.printstud();

        Student stud2=new Student(1,24,"kama","male",2443);
        Student stud3=new Student(2,22,"dfjnhnfd","female",23443443);
        stud2.printstud();
        stud3.printstud();
    }
}