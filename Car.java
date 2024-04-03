class Car{
  
  
  private String name;
  private float speed;
  private String color;
  
  void print(){
    System.out.println(name + " " + speed+ " " + color);
  }

  void SetName(String name) throws Exception{
    if (name.equals("")){
     throw new Exception("Name important ");
    }
    else{
      this.name = name;
    }
  }

  void SetSpeed (float speed) throws Exception{
    if (speed!=180.5){
     throw new Exception("Car have a problem");
    }
    else {
       this.speed = speed;
    }
  }
  
  
  void SetColor(String color)throws Exception{
    if (color.equals("")){
     throw new Exception("Color important");
    }
    else{
     this.color = color;
    }
    
  
  }
  String getName(){
    return name;
  }
  
  float getSpeed(){
    return speed;
  }
  
  String getColor(){
    return color;
  }


}