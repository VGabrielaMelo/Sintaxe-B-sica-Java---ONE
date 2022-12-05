public class LacosEncadeados {
    public static void main(String[] args) {
        for (int multi = 1; multi <= 10; multi++) {
            for (int cont = 0; cont <= 10; cont++) {
               System.out.print(multi * cont);
               System.out.print(" "); 
            }
            
            System.out.println(" ");
        }
    }
}
