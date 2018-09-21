class Student{
    private String name, ID, group, email;

    public Student()
    {
        name ="Student";
        ID = "000";
        group = "k59CB";
        email =  "uet@vnu.edu.vn";
    }

    public Student(String _name, String _id, String _email)
    {
        name =_name;
        ID = _id;
        group = "k59CB";
        email =  _email;
    }
    public Student (Student s)
    {
        name= s.getName();
        ID = s.getID();
        group = s.getEmail();
        email = s.getEmail();
    }

    public void setName(String _name)
    {
        name = _name;
        return;
    }
    public String getName()
    {
        return name;
    }

    public void setID(String _ID)
    {
        ID = _ID;
        
    }
    public String getID()
    {
        return ID;
    }

    public void setGroup(String _group)
    {
        group = _group;
    }
    public String getGroup()
    {
        return group;
    }

    public void setEmail(String _email)
    {
        email = _email;
        
    }
    public String getEmail()
    {
        return email;
    }

    public void getInfo()
    {
        System.out.println("\nten :" + name + "\nID : "+ ID + "\ngroup : "+group + "\nemail : "+email);
    }

    
   
}