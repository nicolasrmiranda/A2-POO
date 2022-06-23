/*A2 NÍCOLAS RIBEIRO MIRANDA
EU E OS GURIS NOS AJUDAMOS NO TRABALHO, ENTÃO A LOGICA PODE SER PARECIDA*/

package Avaliacao2_Veiculos;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Automovel> auto = new ArrayList<>();
        ArrayList<Aviao> aviao = new ArrayList<>();
        ArrayList<Barco> barco = new ArrayList<>();

        String nome;
        String nomeFab;
        String pais;
        int anoFabricacao;
        int capacidade;
        int opc, opt;
        do {
            System.out.println("""
                    1 - Registrar um novo veiculo
                    2 - Interagir com um veiculo
                    0 - Sair""");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("""
                                1 - Registar automovel
                                2 - Registrar aviao
                                3 - Registrar barco
                                0 - Retornar para o menu principal""");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                int diametro;

                                System.out.println("Digite o nome do automovel: ");
                                sc.nextLine();
                                nome = sc.nextLine();
                                System.out.println("Digite o ano de fabricacao do automovel: ");
                                anoFabricacao = sc.nextInt();
                                System.out.println("Digite a capacidade de pessoas do automovel: ");
                                capacidade = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Qual o nome da empresa fabricante: ");
                                nomeFab = sc.nextLine();
                                System.out.println("Pais de origem da " + nomeFab + ":");
                                pais = sc.nextLine();
                                System.out.println("Qual o diametro da roda: ");
                                diametro = sc.nextInt();
                                auto.add(new Automovel(nome, anoFabricacao, capacidade, nomeFab, pais, diametro));

                                for (int i = 0; i < auto.size(); i++) {
                                    Automovel a = auto.get(i);
                                    if (a.getNome().equals(nome)) {
                                        a.mostrarDetalhes();
                                    }
                                }
                                break;
                                case 2:
                                    int turbinas;

                                    System.out.println("Digite o nome do aviao: ");
                                    sc.nextLine();
                                    nome = sc.nextLine();
                                    System.out.println("Digite o ano de fabricacao do aviao: ");
                                    anoFabricacao = sc.nextInt();
                                    System.out.println("Digite a capacidade de pessoas do aviao: ");
                                    capacidade = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Qual o nome da empresa fabricante: ");
                                    nomeFab = sc.nextLine();
                                    System.out.println("Pais de origem da " + nomeFab + ":");
                                    pais = sc.nextLine();
                                    System.out.println("Digite a quantidade de turbinas: ");
                                    turbinas = sc.nextInt();

                                    aviao.add(new Aviao(nome, anoFabricacao, capacidade, nomeFab, pais, turbinas));
                            break;
                            case 3:
                                int velas;

                                System.out.println("Digite o nome do barco: ");
                                sc.nextLine();
                                nome = sc.nextLine();
                                System.out.println("Digite o ano de fabricacao do barco: ");
                                anoFabricacao = sc.nextInt();
                                System.out.println("Digite a capacidade de pessoas do barco: ");
                                capacidade = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Qual o nome da empresa fabricante: ");
                                nomeFab = sc.nextLine();
                                System.out.println("Pais de origem da " + nomeFab + ":");
                                pais = sc.nextLine();
                                System.out.println("Digite a quantidade de velas: ");
                                velas = sc.nextInt();

                                barco.add(new Barco(nome, anoFabricacao, capacidade, nomeFab, pais, velas));
                            break;
                            case 0:
                                System.out.println("Retornando ao menu...");
                            break;
                            default:
                                System.out.println("Opcao invalida");
                            break;
                        }
                    } while (opt != 0);
                    break;
                case 2:
                    do {
                        System.out.println("""
                                1 - Automovel
                                2 - Aviao
                                3 - Barco
                                0 - retornar ao menu principal""");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1:
                                String autoNome;
                                System.out.println("Digite o nome do automovel que deseja utilizar: ");
                                sc.nextLine();
                                autoNome = sc.nextLine();
                                for (int i = 0; i < auto.size(); i++) {
                                    Automovel a = auto.get(i);
                                    if (auto.get(i).getNome().equals(autoNome)) {
                                        do {
                                            System.out.println("""
                                                    1 - Acelerar automovel
                                                    2 - Abrir porta-malas
                                                    3 - Mostrar detalhes do automovel
                                                    0 - Retornar para o menu principal""");
                                            opt = sc.nextInt();
                                            switch (opt) {
                                                case 1:
                                                    a.acelerar();
                                                break;
                                                case 2:
                                                    a.abrirPortaMalas();
                                                break;
                                                case 3:
                                                    a.mostrarDetalhes();
                                                break;
                                                case 0:
                                                    System.out.println("retornando...");
                                                break;
                                                default:
                                                    System.out.println("Opcao invalida");
                                                break;
                                            }
                                        } while (opt != 0);
                                        break;
                                    }
                                }
                            break;
                            case 2:
                                String aviaoNome;
                                System.out.println("Digite o nome do aviao que deseja utilizar: ");
                                sc.nextLine();
                                aviaoNome = sc.nextLine();
                                for (int i = 0; i < aviao.size(); i++) {
                                    Aviao a = aviao.get(i);
                                    if (aviao.get(i).getNome().equals(aviaoNome)) {
                                        do {
                                            System.out.println("1 - Acelerar aviao" +
                                                    "\n2 - Decolar aviao" +
                                                    "\n3 - Pousar aviao" +
                                                    "\n4 - Mostrar detalhes do aviao" +
                                                    "\n0 - Retornar para o menu principal");
                                            opt = sc.nextInt();
                                            switch (opt) {
                                                case 1:
                                                    a.acelerar();
                                                break;
                                                case 2:
                                                    a.decolar();
                                                break;
                                                case 3:
                                                    a.pousar();
                                                break;
                                                case 4:
                                                    a.mostrarDetalhes();
                                                break;
                                                case 0:
                                                    System.out.println("retornando...");
                                                break;
                                                default:
                                                    System.out.println("Opcao invalida");
                                                break;
                                            }
                                        } while (opt != 0);
                                    break;
                                    }
                                }
                                break;
                            case 3:
                                String barcoNome;
                                System.out.println("Digite o nome do barco que deseja utilizar: ");
                                sc.nextLine();
                                barcoNome = sc.nextLine();
                                for (int i = 0; i < barco.size(); i++) {
                                    Barco b = barco.get(i);
                                    if (barco.get(i).getNome().equals(barcoNome)) {
                                        do {
                                            System.out.println("1 - Icar velas" +
                                                    "\n2 - Recolher velas" +
                                                    "\n3 - Acelerar barco" +
                                                    "\n4 - Mostrar detalhes do barco" +
                                                    "\n0 - Retornar para o menu principal");
                                            opt = sc.nextInt();
                                            switch (opt) {
                                                case 1:
                                                    b.descerVelas();
                                                break;
                                                case 2:
                                                    b.icarVelas();
                                                break;
                                                case 3:
                                                    b.acelerar();
                                                break;
                                                case 4:
                                                    b.mostrarDetalhes();
                                                break;
                                                case 0:
                                                    System.out.println("retornando...");
                                                break;
                                                default:
                                                    System.out.println("Opcao invalida");
                                                break;
                                            }
                                        } while (opt != 0);
                                    }
                                }
                            break;
                            case 0:
                                System.out.println("Retornando ao menu principal....");
                            break;
                            default:
                                System.out.println("Opcao invalida");
                            break;
                        }
                    } while (opt != 0);
                    break;
                case 0:
                    System.out.println("Desligando sistema...");
                break;
                default:
                    System.out.println("Opcao Invalida");
                break;
            }
        } while (opc != 0);
        sc.close();
    }
}