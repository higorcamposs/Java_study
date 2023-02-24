public class JavaApplication3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        p1.nome = "Maria";
        p1.idade = 18;
        p1.sexo = 'F';
        p1.cpf = "123.456.789 -00";
        
        Pessoa p2 = new Pessoa ();
        p2.nome = "João";
        p2.idade = 20;
        p2.sexo = 'M';
        p2.cpf = "333.444.555-00";
        
        Conta c1 = new Conta () ;
        c1.numero = "1234 -5";
        c1.tit = p1 ;
        c1.saldo = 0.0;
        c1.lim = 0.0;
        
        Conta c2 = new Conta () ;
        c2.numero = "9999-0";
        c2.tit = p1 ;
        c2.saldo = 100.0;
        c2.lim = 200.0;
        
        c1.sacar(20);
        c1.depositar(100);
        c1.transferir(150,c2);
        c2.extrato();


        // TODO code application logic here
    }
    
}
