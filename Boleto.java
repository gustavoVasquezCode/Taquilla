public class Boleto extends Pasajero{

  private float precioBoleto;
  private int cantidadBoletos;
  private float porcentajeDescuento;

  /* variable para el tipo de descuento */
  private int tipoDescuento;

  public Boleto(){
    precioBoleto = 0;
    cantidadBoletos = 0;
    porcentajeDescuento = 0;
  }

  public void calcularTotalBoletos(){
    validaPorcentaje();
    setTotalBoletos(cantidadBoletos*precioBoleto);
    setTotalBoletos(getTotalBoletos() - (getTotalBoletos()*porcentajeDescuento));
  }

  private void validaPorcentaje(){
    if(tipoDescuento == 1){
      porcentajeDescuento = 0.25f;
    }
    else if(tipoDescuento == 2){
      porcentajeDescuento = 0.50f;
    }
    else if(getCantidadBoletos() > 0 && getCantidadBoletos() <= 10){
      porcentajeDescuento = 0;
    }
    else if(getCantidadBoletos() > 10){
      porcentajeDescuento = 3.8f/100;
    }
  }

  /* metodos set */
  public void setPrecioBoleto(float precioBoleto){
    this.precioBoleto = precioBoleto;
  }

  public void setCantidadBoletos(int cantidadBoletos){
    this.cantidadBoletos = cantidadBoletos;
  }

  public void setPorcentajeDescuento(float porcentajeDescuento){
    this.porcentajeDescuento = porcentajeDescuento;
  }

  public void setTipoDescuento(int tipoDescuento){
    this.tipoDescuento = tipoDescuento;
  }

  /* metodos get */
  public float getPrecioBoleto(){ return precioBoleto; }

  public int getCantidadBoletos(){ return cantidadBoletos; }

  public float getPorcentajeDescuento(){ return porcentajeDescuento; }

  public int getTipoDescuento(){ return tipoDescuento; }
}
