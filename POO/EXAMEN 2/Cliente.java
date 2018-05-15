public class Cliente extends Persona{
  private String tipoCliente;

  //Constructor por defecto
  public Cliente(){
    super();
    tipoCliente=null;
  }
  // Constructor que recibe parametros
  public Cliente(String nombre, String apellido, String direccion, String tipoCliente){
    super(nombre,apellido,direccion);
    this.tipoCliente=tipoCliente;
  }

  public void settipoCliente(String tipoCliente){
    this.tipoCliente=tipoCliente;
  }

  public String gettipoCliente(){
    return tipoCliente;
  }

  public void mostrarDatosCliente(){
    System.out.println("\nEmpleado: " + getNombre() + " " + getApellido() +
                       " \nDireccion: " + getDireccion() +
                       "\nTipo: " + gettipoCliente() +
                       "\n");
  }


  }
