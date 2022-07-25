package one.digitalinnovation.basecamp;

/**
 *  Classe de exemplo para o exercício da Aula 3 de Operadores lógicos e relacionais, Controle de Fluxo e Blocos;
 */

public class Main {

    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void ifFlecha() {

        System.out.println(" Metodo ifFlecha; ");

        int mes = 20;
        if (mes == 1) {
            System.out.println(" Janeiro. ");
        } else {
            if (mes == 2) {
                System.out.println(" Feveriro. ");
            } else {
                if (mes == 3) {
                    System.out.println(" Março. ");
                } else {
                    if (mes == 4) {
                        System.out.println(" Abril. ");
                    } else {
                        if (mes == 5) {
                            System.out.println(" Maio. ");
                        } else {
                            if (mes == 6) {
                                System.out.println(" Junho. ");
                            } else {
                                if (mes == 7) {
                                    System.out.println(" Julho. ");
                                } else {
                                    if (mes == 8) {
                                        System.out.println(" Agosto. ");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println(" Setembro. ");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println(" Outubro. ");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println(" Novembro. ");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println(" Dezembro. ");
                                                    }
                                                    else {
                                                        System.out.println(" Mês Indefinido. ");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ifSemFlecha() {

        System.out.println(" Metodo ifSemFlecha; ");

        int mes = 8;
        if (mes == 1) {
            System.out.println(" Janeiro. ");
        } else if (mes == 2) {
            System.out.println(" Fevereiro. ");
        } else if (mes == 3) {
            System.out.println(" Março. ");
        } else if (mes == 4) {
            System.out.println(" Abril. ");
        } else if (mes == 5) {
            System.out.println(" Maio. ");
        } else if (mes == 6) {
            System.out.println(" Junho. ");
        } else if (mes == 7) {
            System.out.println(" Julho. ");
        } else if (mes == 8) {
            System.out.println(" Agosto. ");
        } else if (mes == 9) {
            System.out.println(" Setembro. ");
        } else if (mes == 10) {
            System.out.println(" Outubro. ");
        } else if (mes == 11) {
            System.out.println(" Novembro. ");
        } else if (mes == 12) {
            System.out.println(" Dezembro. ");
        }

    }

    public static void ifFerias() {
// Neste metodo exemplificamos o uso desnecessario do if, onde podemos ver que um switch seria melhor;
        System.out.println(" Metodo ifFerias; ");

        String mes = " Julho ";
        if (mes == " Julho " || mes == " Dezembro " || mes == " Janeiro ") {
            System.out.println(" Férias HaHa! ");
        } else {
            System.out.println(" Mês Inválido! ");
        }

    }

    public static void ifMenor() {
// Exemplificação melhorada;
        System.out.println(" Metodo ifMenor; ");

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
//  Esta estrutura definitivamente deve ser evitada;
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes))  {
            System.out.println(" Funcionário deve receber auxílio. ");
        }
//  Estrutura mais enchuta; simplificada;
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println(" Funcionário deve receber auxílio. ");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println(" Funcionário deve receber auxílio. ");
        } else {
            System.out.println(" Funcionário não deve receber auxílio! ");
        }

    }

    public static void switchSemana() {

        System.out.println(" Metodo switchSemana; ");

        String dia = "dddddd";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça" :
                System.out.println(3);
                break;
            case "Quarta" :
                System.out.println(4);
                break;
            case "Quinta" :
                System.out.println(50);
                break;
            case "Sexta" :
                System.out.println(6);
                break;
            case "Sabado" :
                System.out.println(7);
                break;
            case "Domingo" :
                System.out.println(1);
                break;
            default:
                System.out.println(" Dia da semana inválido! ");
        }

    }

    public static void switchNumero() {

        System.out.println(" Metodo switchNumero; ");

        int num = 1;
        switch (num) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println(" Certo. ");
                break;
            case 4 :
                System.out.println(" Errado. ");
                break;
            case 5 :
                System.out.println(" Talvez. ");
                break;
            default:
                System.out.println(" Valor Indefinido! ");
                break;
        }

    }

    public static void switchFerias() {

        System.out.println(" Metodo switchFerias; ");

        String mes = "Dezembro";

        switch (mes) {
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println(" Tô de férias! Uhuu! ");
                break;
            default:
                System.out.println(" Mês Indefinido! ");
                break;
        }

    }

}