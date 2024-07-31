class PersonalDetails{
    public void pdetails()
    {
        String name="Shreyansh";
        String Collgename="JIT";
        System.out.println("Name of Student : "+name+" College is "+Collgename);
    }
}
class Education extends PersonalDetails{
    public void edu()
    {
        String qu="BE";
        String Branch="CSE";

        System.out.println("Qualification : "+qu+" Branch: "+Branch);
    }
}
class PLacementDrive extends Education{
    public void place()
    {
        String company="TCS";
        System.out.println("Placement Drive Name "+company);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        PLacementDrive d=new PLacementDrive();
        d.pdetails();
        d.edu();
        d.place();
    }
    
}
