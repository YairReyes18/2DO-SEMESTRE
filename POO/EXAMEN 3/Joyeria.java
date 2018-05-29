import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Joyeria{
  ArrayList<Empleado> trabajadores = new ArrayList<Empleado>();
  ArrayList<Cliente> consumidores = new ArrayList<Cliente>();
  private String nombreJoyeria;
  private int nEmpleado;
  private int nClientes;

//Constructor por defecto
  public Joyeria(){
    trabajadores.add(new Empleado("Andres","Lopez","Lua 12","101230",5457.1));
    nombreJoyeria="Generica";
    nEmpleado=0;
    nClientes=0;
  }

  public Joyeria(String nombreJoyeria, int nEmpleado, int nClientes){
    trabajadores.add(new Empleado("Andres","Lopez","Lua 12","101230",5457.1));
    this.nombreJoyeria=nombreJoyeria;
    this.nEmpleado=nEmpleado;
    this.nClientes=nClientes;
  }
//INCIO METODOS Joyeria
  public void setnombreJoyeria(String nombreJoyeria){
    this.nombreJoyeria=nombreJoyeria;
  }

  public String getnombreJoyeria(){
    return nombreJoyeria;
  }

  public void bienvenida(){
      System.out.println("\n\t¡Bienvenido a la Joyeria '" + getnombreJoyeria() +"'!");
      System.out.println("\tPonemos a tu disposicion a " + trabajadores.size() + " trabajadores.");
    }

  public void infoNClientes(){
    if(consumidores.size()>0){
      System.out.println("\n\t\tActualmente tenemos " + consumidores.size() + " clientes.");
      }
      else{
        System.out.println("\n\tLa Joyeria " + getnombreJoyeria() + " esta vacia :( (NO CLIENTES).");
      }
    }

    public void cerrarJoyeria(){
      consumidores.clear();
      System.out.println("\n\tLos clientes se RETIRARON");
      trabajadores.clear();
      System.out.println("\n\tLos empleados se RETIRARON");
      System.out.println("\n\tLa Joyeria " + getnombreJoyeria() + " ahora esta CERRADA.");
    }


//INCIO METODOS EMPLEADOS
  public void setEmpleado(Empleado nEmpleado){
    System.out.println("\nSe ha unido un nuevo Empleado con el nombre de " + nEmpleado.getNombre());
    trabajadores.add(nEmpleado);
  }

  public void eliminarEmpleado(Empleado nEmpleado){
    System.out.println("\nEmpleado " + nEmpleado.getNombre() + " fue despedido.");
    trabajadores.remove(nEmpleado);
  }

  public void buscarEmpleado(String nombre){
    System.out.println("\nBuscando empleado "+ nombre + "...");
    for(Empleado trabajadores:trabajadores){
      if(trabajadores.getNombre().equals(nombre)){
        System.out.println("\nEmpleado encontrado");
        trabajadores.mostrarDatos();
      }
      else{
        System.out.println("Empleado no encontrado :(");
      }
    }
  }


  public void mostrarEmpleados(){
    int i=0;
        System.out.println("\nLista completa de EMPLEADOS de la Joyeria " + getnombreJoyeria());
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
    System.out.println("\n\t¡Ha llegado un nuevo cliente!");
    consumidores.add(nClientes);
  }

  public void salidaCliente(Cliente nClientes){
    System.out.println("\n\tEl cliente '" + nClientes.getNombre() +"' se retira...");
    consumidores.remove(nClientes);
  }

  public void buscarCliente(String nombre){
    System.out.println("\nBuscando cliente " + nombre +"...");
    for(Cliente consumidores:consumidores){
      if(consumidores.getNombre().equals(nombre)){
        System.out.println("\nCliente encontrado");
        consumidores.mostrarDatos();
      }
      else{
      }
    }
  }

  public void mostrarClientes(){
    int i=0;
        System.out.println("\nLista completa de CLIENTES en la Joyeria " + getnombreJoyeria());
          for (Cliente consumidores:consumidores) {
          System.out.println("Cliente : " + (i+1) +
                             "\n\tNombre: "+ consumidores.getNombre() +" "+ consumidores.getApellido()+
                             "\n\tDireccion: "+ consumidores.getDireccion() +
                             "\n\tTipo Cliente: "+ consumidores.gettipoCliente());
          i++;
          }
  }


  public void Ordenar(){
     Collections.sort(consumidores);  
   }



   public void guardarClientes(){

        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("datosClientes.txt");
            pw = new PrintWriter(fichero);
            pw.println("Clientes de la Joyeria '" + getnombreJoyeria() +"'");
            for (int a=0;a<consumidores.size();a++){
            int p=a+1;
                pw.println("Cliente : " + (p) +
                             "\n\tNombre: "+ consumidores.get(a).getNombre() +" "+ consumidores.get(a).getApellido()+
                             "\n\tDireccion: "+ consumidores.get(a).getDireccion() +
                             "\n\tTipo Cliente: "+ consumidores.get(a).gettipoCliente());

              }
            System.out.println("\t\tArchivo guardado con exito.");
        } catch (Exception e) {
           System.out.println("\t\tError el archivo no se pudo guardar con exito :(");
            e.printStackTrace();
        } finally {
           try {
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    
    }
             

}//fin clase
