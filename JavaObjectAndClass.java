class Students{
String name;
int id;
String Subject;

void setName(String stName)
{this.name = stName;}

void setSubject(String sub)
{this.Subject=sub;}

void display(){
    System.out.println("Student Name: "+name);
    System.out.println("Student id "+id);
    System.out.println("Subejct Name: "+Subject);}
}

public class JavaObjectAndClass {
    public static void main(String[] args) {
        Students s1,s2;
        s1 = new Students();
        s2 = new Students();
        s1.setName("Ankush Jauhari");
        s1.id = 113;
        s1.setSubject("Computer Science");
        
        s2.setName("Karan AS");
        s2.id = 101;
        s2.setSubject("Electrical");

        s1.display();
        s2.display();
    }

}
