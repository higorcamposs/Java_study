public class Pessoa {
    String nome, cpf;
    char sexo;
    int idade;
    
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
