//double saldo == atributo

public class Conta {
    // não pode ser lido nem modificado além da classe Conta
    private double saldo ;
    int agencia  = 1;
    int numero;
    Cliente titular;


    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("Depositado: " + this.saldo);
    }

    public boolean sacar(double valor){
        if ( this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Sacando: " + this.saldo);
            return true;
        }else{
            System.out.println("Salndo insuficiente!");
            return false;
        }
    }

    public boolean transferir( double valor, Conta destino){
        if ( this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

}
