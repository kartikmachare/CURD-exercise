import java.util.*;
class Student
{  
    private String name;
    private int rollno;
    private int marks;
    private String address;

    Student(String name, int rollno,  int marks, String address )
    {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.address = address;
    }

    public String getname()
    {
        return name;
    }
    public int getrollno()
    {
        return rollno;
    }
    public int getmarks()
    {
        return marks;
    }
    public String getaddress()
    {
        return address;
    }

    public String toString()
    {
        return name+" "+rollno+" "+marks+" "+address;
    }
}

class CRUDope
{
    public static void main(String [] args) 
    {
        List<Student> c = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.print("Enter Your Choice :- ");
            ch = sc.nextInt();

            switch(ch){
                case 1 :
                 System.out.print("Enter the Student Name :- ");
                 String name = sc1.nextLine();
                 System.out.print("Enter the Student Roll No :- ");
                 int rollno = sc.nextInt();
                 System.out.print("Enter the Student Percentage :- ");
                 int marks = sc.nextInt();
                 System.out.print("Enter the Student Address :- ");
                 String address = sc1.nextLine();

                 c.add(new Student(name, rollno, marks, address));
                break;
                case 2 :
                System.out.println("------------------------------------");

                 Iterator<Student> i = c.iterator();
                 while(i.hasNext()){
                    Student s = i.next();
                    System.out.println(s);
                 }
                 System.out.println("------------------------------------");

                 break;
                 case 3 :
                    boolean found = false;
                    System.out.print("Enter the Student rollno to Search :- ");
                    int rollno1 = sc.nextInt();
                    System.out.println("------------------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                    Student s = i.next();
                    if(s.getrollno() == rollno1){
                     System.out.println(s);
                     found = true;                    
                                               }
                                      }
                    if(!found){
                        System.out.println("Record not Found");
                    }
                    System.out.println("------------------------------------");
                 break;
                 case 4 :
                    found = false;
                    System.out.print("Enter the Student rollno to Delete :- ");
                    rollno1 = sc.nextInt();
                    System.out.println("------------------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                    Student s = i.next();
                    if(s.getrollno() == rollno1){
                        i.remove();
                     found = true;                    
                                               }
                                      }
                    if(!found){
                        System.out.println("Record not Found");
                    }else{
                        System.out.println("Record is Deleted Successfully.....!");
                    }
                    System.out.println("------------------------------------");
                 break;
                 case 5 :
                    found = false;
                    System.out.print("Enter the Student rollno to Update :- ");
                    rollno1 = sc.nextInt();
                    
                    ListIterator<Student>li = c.listIterator();
                    while(li.hasNext()){
                    Student s = li.next();
                    if(s.getrollno() == rollno1){
                        System.out.print("Enter New Name :-");
                        name = sc1.nextLine();
                        System.out.print("Enter New Roll No :-");
                        rollno = sc.nextInt();
                        System.out.print("Enter New Percentage :-");
                        marks = sc.nextInt();
                        System.out.print("Enter New Address :-");
                        address = sc1.nextLine();

                        li.set(new Student(name, rollno, marks, address));


                     found = true;                    
                                               }
                                      }
                    if(!found){
                        System.out.println("Record not Found");
                    }else{
                        System.out.println("Record is Updated Successfully.....!");
                    }
                 break;
            }

        }while(ch!=0);
    }
}