public class Banco {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ("Maria", 'F', 18, "123.456.789 -00");
        Pessoa p2 = new Pessoa ("Fabio", 'M', 20, "333.444.555-00");
        
        Conta c1 = new Conta ("1234 -5", 0.0, 0.0, p1) ;
        Conta c2 = new Conta ("9999-0", 100.0, 200.0, p2) ;
                
        c1.sacar(20);
        c1.depositar(100);
        c1.transferir(150,c2);
        c1.extrato();
        c2.extrato();
    
    }
    
}
