public class Banco2023 {

    public static void main(String[] args) {
        
        //Criando um objeto da classe Pessoa
        Pessoa p1 = new Pessoa();
        p1.nome =  "Maria";
        p1.idade = 18;
        p1.sexo = 'F';
        p1.cpf = "123.456.789-00";
        
        //Criando outro objeto da classe Pessoa
        Pessoa p2 = new Pessoa();
        p2.nome =  "Joao";
        p2.idade = 22;
        p2.sexo = 'M';
        p2.cpf = "234.567.890-00";
        
        //Criando um objeto da classe Conta
        Conta c1 = new Conta();
        c1.numero = "1234-5";
        c1.titular = p1; // a pessoa p1 eh titular desta conta!
        c1.saldo = 100.0;
        c1.limite = 200.0;
        
        //Criando outro objeto da classe Conta
        Conta c2 = new Conta();
        c2.numero = "2345-6";
        c2.titular = p2; // a pessoa p2 eh titular desta conta!
        c2.saldo = 150.0;
        c2.limite = 200.0;
        
        //Executando o metodo que imprime o extrato
        System.out.println(c1.saldo);
        System.out.println(c1.titular.nome);
        System.out.println("Saldo da conta " + c1.numero + ": " + c1.saldo);
        
    }
}
