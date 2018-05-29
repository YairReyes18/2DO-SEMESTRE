public class Empleado extends Persona{
  private String telefono;
  private double salario;

  //Constructor por defecto
  //Empleado por defecto Juanito
  public Empleado(){
    super("Juanito","Garcia","Reforma 2");
    telefono="9123123";
    salario=100.0;
  }
  // Constructor que recibe parametros
  public Empleado(String nombre, String apellido, String direccion, String telefono, double salario){
    super(nombre,apellido,direccion);
    this.telefono=telefono;
    this.salario=salario;
  }

  public void setTelefono(String telefono){
    this.telefono=telefono;
  }

  public void setSalario(double salario){
    this.salario=salario;
  }

  public String getTelefono(){
    return telefono;
  }

  public double getSalario(){
    return salario;
  }

  public void mostrarDatos(){

    System.out.println("\nEmpleado: " + getNombre() + " " + getApellido() +
                       " \nDireccion: " + getDireccion() +
                       "\nTelefono: " + getTelefono() +
                       "\nSalario: " + getSalario() +
                       "\n");
  }


}
