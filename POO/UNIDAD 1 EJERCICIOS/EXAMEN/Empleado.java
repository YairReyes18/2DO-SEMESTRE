public class Empleado {
  private String nombre;
  private String apellidoPaterno;
  private double salario;

  public Empleado() {
    nombre = null;
    apellidoPaterno = null;
    salario = 0.0;
  }

  public Empleado(String nombre, String apellidoPaterno, double salario) {
    this.nombre=nombre;
    this.apellidoPaterno=apellidoPaterno;
    this.salario=salario;
  }

  public void setNombre(String nombre) {
    this.nombre=nombre;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno=apellidoPaterno;
  }

  public void setSalario(double salario) {
    if (salario>0)
    this.salario=salario;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getApellidoPaterno() {
    return this.apellidoPaterno;
  }

  public double getSalario() {
    return this.salario;
  }

  public double getSalarioANUAL() {
    return this.salario*12.0;
  }
}
