public class Pasajero{

  private String nombre;
  private String ciudadDeOrigen;
  private String ciudadDeDestino;
  private float totalBoletos;


  /* constructor no parametrizado */
  public Pasajero(){
    nombre = "Sin dato";
    ciudadDeOrigen = "Sin dato";
    ciudadDeDestino = "Sin dato";
    totalBoletos = 0;
  }

  /*metodos set*/

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setCiudadDeOrigen(String ciudadDeOrigen){
    this.ciudadDeOrigen = ciudadDeOrigen;
  }

  public void setCiudadDeDestino(String ciudadDeDestino){
    this.ciudadDeDestino = ciudadDeDestino;
  }

  public void setTotalBoletos(float totalBoletos){
    this.totalBoletos = totalBoletos;
  }

  /* metodos set */
  public String getNombre(){ return nombre; }

  public String getCiudadDeOrigen(){ return ciudadDeOrigen; }

  public String getCiudadDeDestino(){ return ciudadDeDestino; }

  public float getTotalBoletos(){ return totalBoletos; }
}
