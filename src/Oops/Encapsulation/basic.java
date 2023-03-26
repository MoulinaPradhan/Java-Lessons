public class test{
    private String name;

    private String idNum;
 
    private int age;
 
    public int getAge() {
 
       return age;
 
    }  public String getName() {

        return name;
  
     }
  
     public String getIdNum() {
  
        return idNum;
  
     }
  
     public void setAge( int newAge) {
  
        age = newAge;
  
     }
  
     public void setName(String newName) {
  
        name = newName;
  
     }
  
     public void setIdNum( String newId) {
  
        idNum = newId;
  
     }
    public static void main(String[] args) {

test t = new test();
t.setAge(78);
System.out.println(t.getAge());
    }
}
