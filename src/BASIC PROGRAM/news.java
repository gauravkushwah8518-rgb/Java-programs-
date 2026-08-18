// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 class news{ 
    private int id;
    private String name ;
    private  String departement ;

    public int getempId(){
        return id;
    }
    public String getname(){
        return name;

    }
    public String getdepartement(){
        return departement;
    }
    public void set_data(int id,String name,String departement){
        this.id = id;
        this.name = name;
        this.departement = departement;

    }
     
      public static void main( String[]args){
            news n = new news();
            n.set_data(12,"rony","cs");
            System.out.println(n.getempId());
            System.out.println(n.getname());
            System.out.println(n.getdepartement());

        

        }
    }

    
        
        
    
