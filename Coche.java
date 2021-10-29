public class Coche{
  private String color;
  private String marca;
  private int numPuertas;
  private int anio;
  private int potencia;

  public Coche(String color, String marca, int numPuertas, int anio, int potencia) {

    this.color = color;
    this.marca = marca;
    this.numPuertas = numPuertas;
    this.anio = anio;
    this.potencia = potencia;
  }
  
  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getMarca(){
    return marca;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public int getNumPuertas(){
    return numPuertas;
  }

  public void setNumPuertas(int numPuertas){
    this.numPuertas = numPuertas;
  }

  public int getAnio(){
    return anio;
  }

  public void setAnio(int anio){
    this.anio = anio;
  }

  public int getPotencia(){
    return potencia;
  }

  public void setPotencia(int potencia){
    this.potencia = potencia;
  }

  @Override
  public String toString(){
    return "Coche (color = "+color+", marca = "+marca+", numPuertas = "
    +numPuertas+", anio = "+anio+", potencia = "+potencia+")";
  }
}