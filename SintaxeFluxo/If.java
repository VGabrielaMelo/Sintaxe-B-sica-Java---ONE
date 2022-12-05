public class If {
    public static void main(String[] args) {
        System.out.println("Testanto Condicionais");

        int idade = 16;
        int quantidadePessoas = 1;

        if (idade > 18) {
            System.out.println("Você tem mais de 18 anos. Seja Bem-Vindo!");
        } else { 
            if (quantidadePessoas >= 2) {
                System.out.println("Sejam Bem-Vindos!");
            } else {
                System.out.println("Infelizmente você não pode entrar!");
            }
        }
    }
}
