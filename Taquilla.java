import java.io.*;

public class Taquilla{
  public static void main(String[] args) throws IOException{
    int opc;
    boolean bandera = true;

    Boleto ado = new Boleto();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Ingrese el nombre del pasajero: ");
    ado.setNombre(reader.readLine());

    System.out.print("Ingrese la ciudad de origen: ");
    ado.setCiudadDeOrigen(reader.readLine());

    System.out.print("Ingrese la ciudad de destino: ");
    ado.setCiudadDeDestino(reader.readLine());

    System.out.print("Ingrese al cantidad de boletos: ");
    ado.setCantidadBoletos(Integer.parseInt(reader.readLine()));

    System.out.print("Ingrese el costo del boleto: ");
    ado.setPrecioBoleto(Float.parseFloat(reader.readLine()));

    while(bandera){
      System.out.println("\n\n>>>>>>>>>> Menu de Ventas <<<<<<<<<<" +
                        "\n 1.Usuario normal" +
                        "\n 2.Usuario con descuento" +
                        "\n 3.Imprimir boletos" +
                        "\n 4. Salir");
      System.out.print("\n Opcion: ");
      opc = Integer.parseInt(reader.readLine());

      if(opc == 1){
        ado.calcularTotalBoletos();
      }
      else if(opc == 2){
        System.out.print("Ingrese tipo de tarjeta de descuento[1:25% - 2:50%]: ");
        ado.setTipoDescuento(Integer.parseInt(reader.readLine()));
        ado.setPorcentajeDescuento(ado.getTipoDescuento());
        ado.calcularTotalBoletos();
      }
      else if(opc == 3){
        System.out.println("\n\n\t>>>>>>>>>> BOLETO ADO <<<<<<<<<<");
        System.out.println("\tPasajero: " + ado.getNombre());
        System.out.println("\tOrigen: " + ado.getCiudadDeOrigen());
        System.out.println("\tDestino: " + ado.getCiudadDeDestino());
        System.out.println("\tCantidad boletos: " + ado.getCantidadBoletos());
        System.out.println("\tTotal: " + ado.getTotalBoletos());
        bandera = false;
      }
      else if(opc == 4){
        bandera = false;
      }
      else
        System.out.println("\nError, la opcion no existe");
    }
  }
}
