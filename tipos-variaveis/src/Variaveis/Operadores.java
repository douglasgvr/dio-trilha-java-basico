// import java.sql.Date;
// import java.util.Objects;

public class Operadores {
    public static void main(String[] args) {
        // // operador de igualdade representado pelo simbolo de igual "="
        // // exmplos:

        // String nome = "GLEYSON";
        // int idade = 22;
        // double peso = 68.5;
        // char sexo = 'M';
        // boolean doadorOrgao = false;
        // @SuppressWarnings("deprecation")
        // Date dataNascimento = new Date(1988, 11, 23);

        // // operadores Aritméticos
        // double soma = 10.5 + 15.7;
        // int subtracao = 113 - 25;
        // int multiplicacao = 20 * 7;
        // int divisao = 15 / 3;
        // int modulo = 18 % 3;
        // double resultado = (10 * 7) + (20 / 4);
        // System.out.println(resultado);

        // // concatenação com o simboo de "+"

        // String nomeCompleto = "Douglas" + " Coelho";
        // System.out.println(nomeCompleto);

        // // ComparacaoAvancada.java

        // String nome1 = "JAVA";
        // String nome2 = "JAVA";

        // System.out.println(Objects.equals(nome1, nome2)); // true

        // String nome3 = "JAVA";

        // System.out.println(Objects.equals(nome1, nome3)); // false

        // String nome4 = nome3;

        // System.out.println(Objects.equals(nome3, nome4)); // true

        // // equals na parada
        // System.out.println(nome1.equals(nome2)); // ??
        // System.out.println(nome2.equals(nome3)); // ??
        // System.out.println(nome3.equals(nome4)); // ??

        // // int numero1 = 130;
        // // int numero2 = 130;
        // // System.out.println(numero1 == numero2); //true

        // Integer numero1 = 130;
        // Integer numero2 = 130;

        // System.out.println(Objects.equals(numero1, numero2)); // false

        // // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // // Como objetos a partir de agora.
        // // Qual a solução ?
        // // Quando queremos comparar objetos, usamos o método equals

        // // System.out.println(numero1.equals(numero2));

        int a;
        int b;
        a = 10;
        b = 10;

        String resultado1 = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado1);

    }

}
