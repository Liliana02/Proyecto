package proyecto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Proyecto[] datosCliente;
        int tam = 0;
        System.out.print("Tamaño de la cartera: ");
        tam = sc.nextInt();
        datosCliente = new Proyecto[tam];
        for (int i = 0; i < datosCliente.length; i++) {
            datosCliente[i] = new Proyecto();
        }
                
        int opc = 3;
        int opc2 = 2;
        int opc3 = 100;
        String opc4;
        int j = 0;
       
        while(opc!=0){
            try {
                System.out.println("-------------------------------");
                System.out.println("Tamaño de la cartera: " + tam);
                System.out.println("Espacio en la cartera: " + (tam-j) );
                System.out.println("1. Agregar Cliente");
                System.out.println("2. Mostrar Clientes");
                System.out.println("3. Buscar Cliente");
                System.out.println("0. Cerrar Sistema");
                System.out.print("Elige una opcion: ");
                opc = sc.nextInt();
                
                switch(opc){
                    case 1:
                        System.out.println("---------Agregar Clientes---------");
                        try{
                            for (int i = 0; i < datosCliente.length; i++) {
                                if(tam>j){
                                    System.out.print("Codigo cliente: ");
                                    datosCliente[i].setCodigoCliente(sc.nextInt());
                                    System.out.print("Nombre: ");
                                    datosCliente[i].setNombre(bf.readLine());
                                    System.out.print("Apellido Paterno: ");
                                    datosCliente[i].setApellidoPaterno(bf.readLine());
                                    System.out.print("Apellido Materno: ");
                                    datosCliente[i].setApellidoMaterno(bf.readLine());
                                    System.out.print("Telefono: ");
                                    datosCliente[i].setTelefono(bf.readLine());
                                    System.out.print("Direccion: ");
                                    datosCliente[i].setDireccion(bf.readLine());
                                    System.out.print("Edad: ");
                                    datosCliente[i].setEdad(sc.nextInt());
                                    j++;
                                }
                                else{
                                    System.out.println("-------------------------------");
                                    System.out.println("Ya no hay espacio en la cartera");
                                    break;
                                }
                            }
                        }
                        catch(Exception e){
                        System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("----------Lista de Clientes----------");
                        try{
                            for (int i = 0; i < datosCliente.length; i++) {
                                System.out.println("--------");
                                if(datosCliente.length==j ){
                                    System.out.println("Codigo Cliente: " + datosCliente[i].getCodigoCliente());
                                    System.out.println("Nombre: " + datosCliente[i].getNombre());
                                    System.out.println("Apellido Paterno: " + datosCliente[i].getApellidoPaterno());
                                    System.out.println("Apellido Materno: " + datosCliente[i].getApellidoMaterno());
                                    System.out.println("Telefono: " + datosCliente[i].getTelefono());
                                    System.out.println("Dirección: " + datosCliente[i].getDireccion());
                                    System.out.println("Edad: " + datosCliente[i].getEdad());
                                }
                                else{
                                  System.out.println("Aun no se han guardado clientes.");
                                  break;
                                }
                            }
                        }
                        catch(Exception e){
                        System.out.println(e.getMessage());
                        }

                        break;
                    case 3:
                        System.out.println("----------Buscar Clientes------------");
                        while(opc2!=0){
                            System.out.println("1. Buscar por codigo");
                            System.out.println("2. Buscar por nombre");
                            System.out.println("0. Regresar al menu anterior");
                            System.out.print("Elige una opcion: ");
                            opc2 = sc.nextInt();
                            
                            switch(opc2){
                                case 1:
                                    System.out.println("---Buscar por codigo---");
                                    System.out.print("Ingrese el codigo de cliente:");
                                    opc3 = sc.nextInt();
                                    if(opc3 >=0 && opc3 < datosCliente.length){
                                        System.out.println("Codigo de Cliente: " + datosCliente[opc3].getCodigoCliente());
                                        System.out.println("Nombre: " + datosCliente[opc3].getNombre());
                                        System.out.println("Apellido Paterno:" + datosCliente[opc3].getApellidoPaterno());
                                        System.out.println("Apellido Materno: " + datosCliente[opc3].getApellidoMaterno());
                                        System.out.println("Telefono: " + datosCliente[opc3].getTelefono());
                                        System.out.println("Direccion: " + datosCliente[opc3].getDireccion());
                                        System.out.println("Edad: " + datosCliente[opc3].getEdad());
                                    }
                                    else{
                                        System.out.println("Ese codigo no esta en la cartera.");
                                        break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("---Buscar por nombre---");
                                    System.out.print("Ingrese el nombre: ");
                                    opc4  = bf.readLine();
                                    
                                    for (int i = 0; i < datosCliente.length; i++) {
                                        if(opc4.equals(datosCliente[i].getNombre())){
                                            System.out.println("Codigo Cliente: " + datosCliente[i].getCodigoCliente());
                                            System.out.println("Nombre: " + datosCliente[i].getNombre());
                                            System.out.println("Apellido Paterno: " + datosCliente[i].getApellidoPaterno());
                                            System.out.println("Apellido Materno: " + datosCliente[i].getApellidoMaterno());
                                            System.out.println("Telefono: " + datosCliente[i].getTelefono());
                                            System.out.println("Direccion: " + datosCliente[i].getDireccion());
                                            System.out.println("Edad: " + datosCliente[i].getEdad());
                                        }
                                        else{
                                            System.out.println("Ese nombre no esta en la cartera.");
                                            break;
                                        }
                                    }
                                    break;
                                case 0:
                                    System.out.println("-----------------------");
                                    System.out.println("Haz salido del submenu.");
                                    break;
                            }
                        }
                        break;
                    case 0:
                        System.out.println("-------------------------------");
                        System.out.println("Saliste del sistema.");
                        System.out.println("-------------------------------");
                        break;
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());           
            }
        }
    }
}
