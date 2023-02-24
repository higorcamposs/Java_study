public class Conta {
    String numero;
    Double saldo,lim;
    Pessoa tit;
    
    Conta(String n, double s, double l, Pessoa t){
        this.numero = n;
        this.saldo = s;
        this.lim = l;
        this.tit = t;
        System.out.println("Nova conta criada!");
    }
    
    Double disponivel(){
        return this.saldo + this.lim;
    }
    void extrato(){
        System.out.println("Titular: " + this.tit.nome);
        System.out.println("Saldo disponivel: R$" + this.disponivel());
    }
    void depositar(double v){
        this.saldo += v;
        System.out.println("âœ” Depositar realizado!");
    }
    boolean sacar(double v){
        if (v <= this.disponivel()){
            this.saldo -= v;
            System.out.println("âœ” Saque realizado!");
            return true;
        }
        else{
            System.out.println("âŒ Sem saldo!");
            return false;
        }
    }
    void transferir(double v, Conta dest){
        if(this.sacar(v)){
            dest.depositar(v);
            System.out.println("âœ” TransferÃªncia realizada!");
        }
        else{
            System.out.println("âŒ Transferir nÃ£o realizado!");
        }
    }
      
}
