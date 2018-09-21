import java.util.Scanner;
class StudentManagement
{
    static int n =3;
    static Student students [] = new Student[100];
    public static void main(String args[])
    {
       

         Student aStudent = new Student();
         aStudent.setName("Nguyen Van Tu");
         aStudent.setID("17021096");
         aStudent.setGroup("OOP");
         aStudent.setEmail("nguyenvantuhym@gmail.com");
         aStudent.getInfo();
         
         Student Student1 = new Student("tu","000","email@gmail.com"); // overload contructor 
         Student Student2 = new Student();// overload contructor 
         Student Student3 = new Student(Student1);// overload contructor 


         Student1.setName("Nguyen Van A");
         Student1.setID("17021096");
         Student1.setGroup("OOP");
         Student1.setEmail("nguyenvantuhym@gmail.com");
         Student1.getInfo();

         Student2.setName("Nguyen Van B");
         Student2.setID("17021096");
         Student2.setGroup("HDT");
         Student2.setEmail("nguyenvantuhym@gmail.com");
         Student2.getInfo();

         Student3.setName("Nguyen Van C");
         Student3.setID("17021096");
         Student3.setGroup("OOP");
         Student3.setEmail("nguyenvantuhym@gmail.com");
         Student3.getInfo();

         if(sameGroup(Student1, Student3)) System.out.println("student1 va student3  cung group!!!");
            else System.out.println("student1 va student3 khong cung group!!!"); // kiem tra  2 doi tuong co cung group k


        if(sameGroup(Student1, Student2)) System.out.println("student1 va student2  cung group!!!");
            else System.out.println("student1 va student2 khong cung group!!!"); // kiem tra  2 doi tuong co cung group k


            Scanner input = new Scanner(System.in);   
            System.out.print("nhap so sinh vien:");
            n = input.nextInt();input.nextLine();
    
            String name, id, email,group;
            for(int i=0; i<n; i++)
            {
                System.out.print("nhap name:");
                 name = input.nextLine();
                 System.out.print("nhap id:");
                 id = input.nextLine();
                 System.out.print("nhap email:");
                 email = input.nextLine();
                 System.out.print("nhap group:");
                 group = input.nextLine();
    
                students[i] = new Student(name,id,email);
                students[i].setGroup(group);
            }
            studentByGroup(); // nhap vao mang test hàm studentByGroup 
    
             
            
    
            removeStudent(students[0].getID());

            for(int i=0; i<n; i++)
            {
                students[i].getInfo();// show information cac phan tu trong mang
            }
            
    }

     static boolean sameGroup(Student s1, Student s2)
    {
			if(s1.getGroup() == null||s2.getGroup() == null)
			{
				System.out.print("co loi say ra!!");
				return false;
			}
        if(s1.getGroup().equals(s2.getGroup())) return true; else return false;
    }

     static void studentByGroup()
    {
       boolean array_tmp[] = new boolean[n];

       for(int i = 0; i<n; i++) array_tmp[i]=true;

        for(int i = 0; i < n-1; i++)
        {
             if(array_tmp[i])
             {

                System.out.println("\n danh sach sinh vien thuoc group :"+ students[i].getGroup());
                students[i].getInfo();
                array_tmp[i] =false;
                for(int j = i+1;j < n; j++)
                {
                    if(sameGroup(students[i], students[j]))
                    {
                        students[j].getInfo();
                        array_tmp[j]= false;
                        
                    }
                }
             }
        }
            
    }

    static void removeStudent(String id)
    {
        int i =0;
        while(i < n&&students[i].getID() != id)  i++;
        boolean kt= false;
        while(i < n)
        {
            kt=true;
            students[i] = students[i+1];
        }
        if(kt==true) n--;
       
        return;
    }
}