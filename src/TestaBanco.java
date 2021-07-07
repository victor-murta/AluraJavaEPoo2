public class TestaBanco {
    public static void main(String[] args) {
        Cliente victor = new Cliente();
        victor.nome = "Victor Murta Garcia";
        victor.cpf = "2222222222";
        victor. profissao = "Desenvolvedor";



        Conta contaVictor = new Conta();


        contaVictor.titular = victor ;
        contaVictor.deposita(100);
    }
}
