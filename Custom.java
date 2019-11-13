public class Custom{
  private String name;
  private char gender;
  private String telephone;
  private int age;
  private String email;
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public void setGender(char gender){
    this.gender =gender;
  }
  public char getGender(){
    return this.gender;
  }
  public void setTelephone(String telephone){
    this.telephone =telephone;
  }
  public char getTelephone(){
    return this.telephone;
  }public void setAge(int age){
    this.age =age;
  }
  public int getAge(){
    return this.age;
  }
  public void setEmail(String email){
    this.email =email;
  }
  public String setEmail(){
    return this.email;
  }
  
  public Custom(){
  }
  public Custom(String name,char gender,String age,String telephone,String email){
    this.name=name;
    this.gender=gender;
    this.age=age;
    this.telephone= telephone;
    this.email=email;
  }
  
}  
  
