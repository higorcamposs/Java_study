public class Conta {
    String numero;
    Double saldo,lim;
    Pessoa tit;
    
    Double disponivel(){
        return this.saldo + this.lim;
    }
    void extrato(){
        System.out.println("Titular: " + this.tit.nome);
        System.out.println("Saldo disponivel: R$" + this.disponivel());
    }
    void depositar(double v){
        this.saldo += v;
        System.out.println("✔ Depositar realizado!");
    }
    boolean sacar(double v){
        if (v <= this.disponivel()){
            this.saldo -= v;
            System.out.println("✔ Saque realizado!");
            return true;
        }
        else{
            System.out.println("❌ Sem saldo!");
            return false;
        }
    }
    void transferir(double v, Conta dest){
        if(this.sacar(v)){
            dest.depositar(v);
            System.out.println("✔ Transferência realizada!");
        }
        else{
            System.out.println("❌ Transferir não realizado!");
        }
    }
      
}
