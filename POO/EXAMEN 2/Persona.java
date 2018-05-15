public class Persona{
  private String nombre;
  private String apellido;
  private String direccion;

  public Persona(){
    nombre=null;
    apellido=null;
    direccion=null;
  }

  public Persona(String nombre, String apellido, String direccion){
    this.nombre=nombre;
    this.apellido=apellido;
    this.direccion=direccion;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public void setApellido(String apellido){
    this.apellido=apellido;
  }

  public void setDireccion(String direccion){
    this.direccion=direccion;
  }

  public String getNombre(){
    return nombre;
  }

  public String getApellido(){
    return apellido;
  }

  public String getDireccion(){
    return direccion;
  }

  public void mostrarDatos(){
    System.out.println("Persona: " + getNombre() + " " + getApellido() + " \ndireccion: " + getDireccion() + "\n");
  }


}
