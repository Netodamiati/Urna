
package Urna;

class Candidato {
    String nome;
    String partido;
    String numero;
    int votos = 0;
    
    public Candidato(String numero, String nome, String partido) {
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
       
    }
    
    public void Votar() { votos++; }
    public int getVotos() { return votos; }
    public String getNumero() { return numero; }
    public String getNome() { return nome; }
    public String getPartido() { return partido; }
}