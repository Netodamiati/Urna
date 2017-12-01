
package Urna;

import java.util.ArrayList;
import java.util.Scanner;



public class ClasseUrna {
  int menu;
    ArrayList<Candidato> Candidatos = new ArrayList<Candidato>();
        Scanner tec = new Scanner (System.in);
        
        
    public ClasseUrna() {
    }
    
    public void MenuOpcoes(){
         do {
            System.out.println("1 - Cadastrar candidato");
            System.out.println("2 - Resultado eleiçao");
            System.out.println("3 - iniciar eleição ");
            System.out.println("4 - Finalizar");
            menu = tec .nextInt();
            if (menu == 1){
                 ClasseUrna i = new ClasseUrna();
        i.CadastrarCandidato();
            }
            if(menu == 2){
                 ClasseUrna i = new ClasseUrna();
        i.ResultadoEleicao();
            }
            if(menu == 3){
                ClasseUrna i = new ClasseUrna();
        i.IniciarEleicao();
            }
         } while (menu !=4 );

    }
    
    public void CadastrarCandidato(){

        
        System.out.println("digite o numero");
       
                String numero = tec.next();
                System.out.println("digite o nome ");
                String nome = tec.next();
                System.out.println("digite o partido");
                String partido = tec.next();
                Candidatos.add(new Candidato(numero, nome, partido));                
    }
    
    public void IniciarEleicao(){
        System.out.println(Candidatos.get(0).getNome());
                System.out.println("Digite um numero de quem deseja votar");
                String n = tec.next();
                int i = 0;
                for (; i < Candidatos.size(); i++) {
                    if (Candidatos.get(i).getNumero().equals(n)) {
                        break;
                    }
                }
                if (i != Candidatos.size()) Candidatos.get(i).Votar();
            
    }
    
    public void ResultadoEleicao(){
          
        System.out.println("Digite um numero");
        String n = tec.next();
        for (int i = 0; i < Candidatos.size(); i++) {
            if (Candidatos.get(i).getNumero().equals(n)) {
                System.out.println(Candidatos.get(i).getNome() + ", " + Candidatos.get(i).getPartido() + ", " + Candidatos.get(i).getVotos());
            }
        }    
    }
}
