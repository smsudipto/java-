public class Person
{
        String name;
        static final int age;//Static blank final variable
        final String UniversityName="Bangladesh University of Business and Technology";
        //Final blank variable

        static{
            age=25;

        }
        Person(){
            name="SUDIPTO MANDAL";
        }
 void Display()
            {
            System.out.println("Name:"+name);
            System.out.println("age:"+age);
            System.out.println("UniversityName:"+UniversityName);
 }


}
