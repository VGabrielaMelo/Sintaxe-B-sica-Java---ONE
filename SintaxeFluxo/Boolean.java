public class Boolean {
    public static void main(String[] args) {
        System.out.println("Testanto Condicionais");

        int idade = 16;
        boolean acompanhado = true;

        // || - OU / && - E
        if (idade > 18 ||  acompanhado) {
            System.out.println("Seja Bem-Vindo!");
        } else { 
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
}
