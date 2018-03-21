public class PruebaEmpleado{
  public static void main(String[] args){
    Empleado e1,e2;

    //Objeto 1
    System.out.println("Empleados por Yair Reyes");

    e1 = new Empleado();
    e1.setNombre("Juan");
    e1.setApellidoPaterno("Corrales");
    e1.setSalario(8.0);

    System.out.println("Empleado 1");
    System.out.println("Nombre: " + e1.getNombre());
    System.out.println("Apellido Paterno: " + e1.getApellidoPaterno());
    System.out.println("Salario MENSUAL: " + e1.getSalario());
    System.out.println("Salario ANUAL: " + e1.getSalarioANUAL());
    System.out.printf("\n\n");

    //Objeto 2
    e2 = new Empleado();
    e2.setNombre("Pedro");
    e2.setApellidoPaterno("Mayoral");
    e2.setSalario(-10.0);

    System.out.println("Empleado 2");
    System.out.println("Nombre: " + e2.getNombre());
    System.out.println("Apellido Paterno: " + e2.getApellidoPaterno());
    System.out.println("Salario MENSUAL: " + e2.getSalario());
    System.out.println("Salario ANUAL: " + e2.getSalarioANUAL());


  }
}
