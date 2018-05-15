public class PruebaCafeteria{
  public static void main(String[] args){

    Cafeteria Lupe = new Cafeteria();
    Lupe.setnombreCafeteria("Lupe");
    Empleado e1 = new Empleado("Yair","Reyes","Juarez 15","12312312",100.50);
    Empleado e2 = new Empleado("Pedro","Morales","Juarez 1125","123212312",300.50);
    Empleado e3 = new Empleado("Andrea","Jimenez","Rosas 45","1249212312",1000.50);
    //Lupe.setEmpleado(new Empleado("Yair","Reyes","Juarez 15","12312312",100.50));
    //e1.mostrarDatosEmpleado();
    Lupe.setEmpleado(e1);
    Lupe.setEmpleado(e2);
    Lupe.setEmpleado(e3);

    Lupe.bienvenida();
    Lupe.mostrarEmpleados();
    Lupe.infoNClientes();

    Cliente c1 = new Cliente("Michelle","Garcia","Arboles 12","Platino");
    Lupe.setCliente(c1);

    Lupe.infoNClientes();

    Cliente c2 = new Cliente("Ana","Fernandez","Arboles 122","Normal");
    Lupe.setCliente(c2);

    Lupe.infoNClientes();
    Lupe.mostrarClientes();

    Lupe.salidaCliente(c2); //"borramos" cliente c2
    Lupe.infoNClientes();
    Lupe.mostrarClientes();
    Lupe.buscarCliente("Michelle");
    c1.settipoCliente("General"); //Modificamos un atributo del cliente usando el get de su clase
    e1.setDireccion("Morelos 91"); //actualizamos nueva direccion del empleado e1
    Lupe.eliminarEmpleado(e2); //Borramos a este empleado
    Lupe.mostrarClientes();
    Lupe.mostrarEmpleados();

    Lupe.cerrarCafeteria();

    System.out.println("\n\n\tCafeteria Generica");

    //Cafeteria por defecto
    Cafeteria andres = new Cafeteria();
    Empleado a1 = new Empleado(); //No le pasamos ningun dato asi que obtendra al empleado por defecto
    Cliente ca1 = new Cliente();
    andres.setEmpleado(a1);
    andres.mostrarEmpleados();
    andres.mostrarClientes();

  }
}
