public class PruebaJoyeria{
  public static void main(String[] args){

    Joyeria Lupe = new Joyeria();
    Lupe.setnombreJoyeria("Lupe");
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

    Cliente c3 = new Cliente("Zulema","Osorio","Arboles 11222","Normal");
    Lupe.setCliente(c3);

    System.out.println("\t\n Lista Clientes DESORDENADA\n");
    Lupe.mostrarClientes();
    Lupe.Ordenar();
    System.out.println("\t\n Lista Clientes ORDENADA\n");
    Lupe.mostrarClientes();
    System.out.println("\t\n Guardamos la lista de CLIENTES en un archivo\n");
    Lupe.guardarClientes();


    Lupe.salidaCliente(c2); //"borramos" cliente c2
    Lupe.infoNClientes();
    Lupe.mostrarClientes();
    Lupe.buscarCliente("Michelle");
    c1.settipoCliente("Normal"); //Modificamos un atributo del cliente usando el get de su clase
    e1.setDireccion("Morelos 91"); //actualizamos nueva direccion del empleado e1
    Lupe.eliminarEmpleado(e2); //Borramos a este empleado
    Lupe.mostrarClientes();
    Lupe.mostrarEmpleados();

    Lupe.cerrarJoyeria();

    System.out.println("\n\n\tJoyeria Generica");

    //Joyeria por defecto
    Joyeria andres = new Joyeria();
    Cliente ca1 = new Cliente();
    andres.mostrarEmpleados();
    andres.mostrarClientes();

  }
}
