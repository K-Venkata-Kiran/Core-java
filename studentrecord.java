class student{
    String name;
    String studentid;
    String Department;
    String Status;
}
public class studentrecord {
    public static void main(String[] args) {
        student student1=new student();
        student1.name="kiran";
        student1.studentid="19BEC0583";
        student1.Department="SENSE";
        student1.Status="Good";
        student student2=new student();
        student2.name="tarun";
        student2.studentid="19BEC0899";
        student2.Department="SENSE";
        student2.Status="good";
        System.out.println("--------------------------------------");
        System.out.println(student1.name);
        System.out.println(student1.studentid);
        System.out.println(student1.Department);
        System.out.println(student1.Status);
        System.out.println("--------------------------------------");
        System.out.println(student2.name);
        System.out.println(student2.studentid);
        System.out.println(student2.Department);
        System.out.println(student2.Status);
    }
}
