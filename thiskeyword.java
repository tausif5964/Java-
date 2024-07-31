/*
 this keyword is used to refer object data members of given class which is alo used to handle naming collision.

 Note:Naming collision -Whenever we use same data members in class and constructor it wil generate naming
 collision due to which we get garbage data.

 */
class Student{//classname
    int roll_no;
    String name;
    float height;//data member

        //constructor define
        Student(int roll_no,String name,float height)
        {
            this.roll_no=roll_no;
            this.name=name;
            this.height=height;
        }

        void display()
        {
            System.out.println("Name: "+name+" roll no: "+roll_no+" Height: "+height);
        }
}

public class thiskeyword {
 public static void main(String[] args) {
      Student  s1=new Student(45, "Shreyansh", 5.5F);
      Student  s2=new Student(78, "Sayali", 5.2F);
      Student s3=new Student(87, "Rushik", 5.4F);
      Student s4=new Student(44, "Saksham", 5.5F);

      s1.display();
      s2.display();
      s3.display();
      s4.display();
 }    
}
