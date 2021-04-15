public class House extends Genre {

    public String subgenress;
    public House(String name, String tempo) {
      super(name, tempo);
      this.subgenress = "50+";
      
      
    }

    public void subgenres(){
      System.out.println("house has many subgenres, about: "+this.subgenress);
    
    }
  
   
  }