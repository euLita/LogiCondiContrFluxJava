package one.digitalinnovation.basecamp;

/**
 *  Classe de exemplo para o exercício da Aula 2 de Operadores lógicos e relacionais, Controles de fluxo e Blocos.
 */

public class Main {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(" b1 && b2 => " + (b1 && b2));
        System.out.println(" b1 && b3 => " + (b1 && b3));

        System.out.println(" b2 || b3 => " + (b2 || b3));
        System.out.println(" b2 || b4 => " + (b2 || b4));

        System.out.println(" b1 ^ b3 => " + (b1 ^ b3)); // Uso do xor;
        System.out.println(" b4 ^ b1 => " + (b4 ^ b1));

        System.out.println(" !b1 => " + (!b1)); // Uso da negação;
        System.out.println(" !b2 => " + (!b2));

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println(" ((i1 + i2) < (f2 - f1)) && true => " + (((i1 + i2) < (f2 - f1)) && true)); // Aqui deve dar true, (true < true && true;
        System.out.println(" (i1 > i2) || (f2 < f1) => " + ((i1 > i2) || (f2 < f1)));


//  Exemplo de Boa Prática;
        System.out.println(" Exemplo de Boas Práticas; ");
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

//  Simplificado; simplificações que melhoram a leitura do código;
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println(" recebeAuxilio => " + recebeAuxilio);


    }

}
