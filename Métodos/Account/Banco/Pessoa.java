public class Pessoa{
    
    String nome, cpf;
    char sexo;
    int idade;   
    
    Pessoa(String n, char s, int i, String c){
        this.nome = n;
        this.sexo = s;
        this.idade = i;
        this.cpf = c;
        System.out.println("Nova pessoa criada!");
    }
       
    void aniversario(){
        this.idade = this.idade +1;
    }
    void alterarcpf(String c){
        this.cpf = c;
    }
    int consultaridade(){
        return this.idade;
    }
}
