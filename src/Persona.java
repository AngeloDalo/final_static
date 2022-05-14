public class Persona {
    String nome;
    String cognome;
    static int numeroPersone;

    //chiamato automaticamente
    Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        numeroPersone++;
    }

    //SECONDO METODO
    static void mostraNumPersone() {
        System.out.println("numero persone " + numeroPersone);
    }
}