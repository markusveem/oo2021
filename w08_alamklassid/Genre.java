public abstract class Genre {
    public String name;
    public String tempo;
   
  
    public Genre(String name, String tempo){
      this.name = name;
      this.tempo = tempo;
    }
  
    public void GenreTempo(){
      System.out.println(this.name + " tempo is mostly: " + this.tempo+ " bpm");
    }

  }
  
    