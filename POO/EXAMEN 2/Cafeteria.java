import java.util.ArrayList;
public class Cafeteria{
  ArrayList<Empleado> trabajadores = new ArrayList();
  ArrayList<Cliente> consumidores = new ArrayList();
  private String nombreCafeteria;
  private int nEmpleado;
  private int nClientes;

//Constructor por defecto
  public Cafeteria(){
    nombreCafeteria=null;
    nEmpleado=1; //Por la regla del negocio el empleado siempre tendra por defecto al menos un Empleado
    nClientes=0;
  }

  public Cafeteria(String nombreCafeteria, int nEmpleado, int nClientes){
    this.nombreCafeteria=nombreCafeteria;
    this.nEmpleado=nEmpleado;
    this.nClientes=nClientes;
  }
//INCIO METODOS CAFETERIA
  public void setnombreCafeteria(String nombreCafeteria){
    this.nombreCafeteria=nombreCafeteria;
  }

  public String getnombreCafeteria(){
    return nombreCafeteria;
  }

  public void bienvenida(){
      System.out.println("\n\t¡Bienvenido a la cafeteria '" + getnombreCafeteria() +"'!");
      System.out.println("\tPonemos a tu disposicion a " + trabajadores.size() + " trabajadores.");
    }

  public void infoNClientes(){
    if(consumidores.size()>0){
      System.out.println("\nActualmente tenemos " + consumidores.size() + " clientes.");
      }
      else{
        System.out.println("La cafeteria " + getnombreCafeteria() + " esta vacia :(.");
      }
    }

    public void cerrarCafeteria(){
      consumidores.clear();
      System.out.println("Los clientes se retiraron");
      trabajadores.clear();
      System.out.println("Los empleados se retiraron");
      System.out.println("La cafeteria " + getnombreCafeteria() + " ahora esta cerrada.");
    }


//INCIO METODOS EMPLEADOS
  public void setEmpleado(Empleado nEmpleado){
    System.out.println("\nSe ha unido un nuevo Empleado");
    trabajadores.add(nEmpleado);
  }

  public void eliminarEmpleado(Empleado nEmpleado){
    System.out.println("\nEmpleado despedido.");
    trabajadores.remove(nEmpleado);
  }

  public void buscarEmpleado(String nombre){
    System.out.println("Buscando empleado...");
    for(Empleado trabajadores:trabajadores){
      if(trabajadores.getNombre().equals(nombre)){
        System.out.println("\nCliente encontrado");
        trabajadores.mostrarDatosEmpleado();
      }
      else{
        System.out.println("Cliente no encontrado :(");
      }
    }
  }


  public void mostrarEmpleados(){
    int i=0;
        System.out.println("\nLista completa de EMPLEADOS del cafe " + getnombreCafeteria());
          for (Empleado trabajadores:trabajadores) {
          System.out.println("Empleado : " + (i+1) +
                             "\n\tNombre: "+ trabajadores.getNombre() +" "+ trabajadores.getApellido()+
                             "\n\tDireccion: "+ trabajadores.getDireccion() +
                             "\n\tTelefono: "+ trabajadores.getTelefono()+
                             "\n\tSalario: "+ trabajadores.getSalario());
          i++;
          }
  }



//INICIO METODOS nClientes

  public void setCliente(Cliente nClientes){
    System.out.println("\n¡Ha llegado un nuevo cliente!");
    consumidores.add(nClientes);
  }

  public void salidaCliente(Cliente nClientes){
    System.out.println("\nUn cliente se retira...");
    consumidores.remove(nClientes);
  }

  public void buscarCliente(String nombre){
    System.out.println("Buscando cliente...");
    for(Cliente consumidores:consumidores){
      if(consumidores.getNombre().equals(nombre)){
        System.out.println("\nCliente encontrado");
        consumidores.mostrarDatosCliente();
      }
      else{
        System.out.println("Cliente no encontrado :(");
      }
    }
  }

  public void mostrarClientes(){
    int i=0;
        System.out.println("\nLista completa de CLIENTES en el cafe " + getnombreCafeteria());
          for (Cliente consumidores:consumidores) {
          System.out.println("Cliente : " + (i+1) +
                             "\n\tNombre: "+ consumidores.getNombre() +" "+ consumidores.getApellido()+
                             "\n\tDireccion: "+ consumidores.getDireccion() +
                             "\n\tTipo Cliente: "+ consumidores.gettipoCliente());
          i++;
          }
  }


}//fin clase
