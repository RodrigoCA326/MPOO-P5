class Main {
  public static void main(String[] args) {
  Circulo cir = new Circulo();
  System.out.println(cir);
  cir.setRadio(5.6f); //primera solucion
  System.out.println(cir);
  cir.setRadio((float)7.33); //segunda solucion
  System.out.println(cir);
  float var = -8.66f;
  cir.setRadio(var);
  System.out.println(cir);
  System.out.println("########  Composicion #######");
  Persona persona_1 = new Persona("Susana","Vazquez",16,07,1982);
  System.out.println(persona_1);


  System.out.println("########Actividad Extra#######");
  Persona persona1 = new Persona("Carlos","Echeverria",27,9,1976);
  Persona persona2 = new Persona("Jose", "Navarro", 4, 8, 1995);
  Persona persona3 = new Persona("Valeria","Hernandez",2,8,2012);
  Persona persona4 = new Persona("Manuel","Fonseca",14,12,1995);
  Coche coche1 = new Coche("Blanco","Volkswagen",5,2018,390);
  System.out.println(coche1);
  System.out.println("Chofer = "+persona1);
  System.out.println("Copiloto = "+persona2);
  System.out.println("Pasajero1 = "+persona3);
  System.out.println("Pasajero2 = "+persona4);
  }
}