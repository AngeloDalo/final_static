public class App {
    public static void main(String[] args) throws Exception {
        //final non può essere modificata nel programma
        final int prova = 5;
        //NON PUO' ESSERE ASSEGNATA      prova = 10;
        System.out.println(prova);

        //static attributo univoco per ogni istanza della classe
        //variabile condivisa da tutte le istanze della classe
        //numeroPersone di Persona.java è condiviso da tutte le istanza
        Persona persona1 = new Persona("Luca", "Rossi");
        Persona persona2 = new Persona("Luca2", "Rossi2");
        //PRIMO METODO
        System.out.println("numero persone " + Persona.numeroPersone);
        //SECONDO METODO
        Persona.mostraNumPersone();
    }
}
