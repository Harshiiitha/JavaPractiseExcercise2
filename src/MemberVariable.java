

import java.util.*;
class Member{
    String name;
    int age;
    float salary;
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public float getSalary()
    {
        return salary;
    }
}
class MemberVariable
{
    public static void main(String[] args)
    {
        String name;
        int age;
        float salary;
        Scanner sc=new Scanner(System.in);
        Member m=new Member();
        System.out.println("Enter your name");
        m.name=sc.next();
        System.out.println("Enter your age");
        m.age=sc.nextInt();
        System.out.println("Enter your salary");
        m.salary=sc.nextFloat();
        System.out.println(m.getName());
        System.out.println(m.getAge());
        System.out.println(m.getSalary());
    }
}
