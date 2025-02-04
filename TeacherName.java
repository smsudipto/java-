public class TeacherName {
    public static void main(String[] args) {
        Teacher  teacher1=new Teacher();
        teacher1.name="SUDIPTO MANDAL";
        teacher1.age=50;
        teacher1.id=81;
        teacher1.height=6;
        teacher1.teacherDetails();

        System.out.println( " ");
        Teacher teacher2=new Teacher();
        teacher2.name="SOJIB SHEIKH";
        teacher2.age=51;
        teacher2.id=50;
        teacher2.height=5;
        teacher2.teacherDetails();

        System.out.println( " ");
        Teacher teacher3=new Teacher();
        teacher3.name="RAIHAN MOLLA";
        teacher3.age=55;
        teacher3.id=68;
        teacher3.height=5;
        teacher3.teacherDetails();
    }
}
