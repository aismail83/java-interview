package async;

class Enterprise {
  String id;
  String name;
  String ceo_id;

  public Enterprise(String id, String name, String ceo_id) {
    this.id = id;
    this.name = name;
    this.ceo_id = ceo_id;
  }
  public getceo_id(){
   return this.ceo_id ;
 }



  public String toString() {
    return "Enterprise_" + name;
  }
}
