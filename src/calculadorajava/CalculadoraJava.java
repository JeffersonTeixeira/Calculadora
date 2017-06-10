package calculadorajava;
public class CalculadoraJava {
    public static void main(String[] args) {
        
        Operacoes1 op1 = new  Operacoes1();
        Operacoes2 op2 = new Operacoes2();
        
        System.out.println("O resultado da soma é: "+op1.soma(5, 4));
        System.out.println("O resultado da subtração é: "+op1.subtracao(3, 2));
        System.out.println("O resultado da multiplicação é: "+op2.multiplicacao(5, 5));
        System.out.println("O resultado da divisão é: "+op2.divisao(10, 5));
    }

   
}
