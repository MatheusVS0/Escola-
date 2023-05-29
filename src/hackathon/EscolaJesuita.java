package hackathon;

import java.util.ArrayList;
import java.util.Scanner;

public class EscolaJesuita {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();

        Aluno aluno;
        Turma turma;
        int opcao = 0;
        int qtdAlunos = 0;
        int qtdTurmas = 0;

        while (opcao != 5) {
            System.out.println("1 - Cadastrar turma");
            System.out.println("2 - Cadastrar aluno");
            System.out.println("3 - Cadastrar notas");
            System.out.println("4 - Gerar Relatório");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("- - - Cadastro de Turma - - -");
                    System.out.print("Quantas turmas deseja cadastrar: ");
                    qtdTurmas = input.nextInt();
                    for (int i = 0; i < qtdTurmas; i++) {
                        turma = new Turma();
                        System.out.print("ID da turma: " + (i + 1));
                        turma.setIdTurma(i + 1);
                        System.out.print("\nNome da turma: ");
                        turma.setNomeTurma(input.nextLine());
                        turma.setNomeTurma(input.nextLine());
                        System.out.print("Quantidade de Alunos: ");
                        turma.setQtdAlunos(input.nextInt());
                        System.out.println(" - - - - - - - - - - - - - - -");

                        turmas.add(turma);
                    }
                    break;
                case 2:
                    System.out.println("- - - Cadastro de Aluno - - -");
                    System.out.print("Quantos alunos deseja cadastrar: ");
                    qtdAlunos = input.nextInt();
                    for (int i = 0; i < qtdAlunos; i++) {
                        aluno = new Aluno();
                        System.out.print("ID do aluno: " + (i + 1));
                        aluno.setIdAluno(i + 1);
                        System.out.print("\nNome do aluno: ");
                        aluno.setNomeAluno(input.next());
                        System.out.println("Turmas cadastradas");
                        if (turmas.size() != 0) {
                            for (int j = 0; j < qtdTurmas; j++) {
                                System.out.printf("%d - %s\n", turmas.get(j).getIdTurma(), turmas.get(j).getNomeTurma());
                            }
                            System.out.print("Informe o ID da turma: ");
                            int turmaopcao = input.nextInt();
                            if (turmas.get(turmaopcao - 1).getQtdAlunos() <= 0) {
                                System.out.println("Número Máximo de alunos cadastrados para a turma");
                            } else {
                                if (turmas.contains(turmas.get(turmaopcao - 1))) {
                                    aluno.setIdTurma(turmas.get(turmaopcao - 1));
                                    turmas.get(turmaopcao - 1).setQtdAlunos(turmas.get(turmaopcao - 1).getQtdAlunos() - 1);
                                    alunos.add(aluno);
                                    turmas.get(turmaopcao - 1).addAluno(aluno);
                                } else {
                                    System.out.println("ID de turma inválido");
                                }

                            }
                        } else {
                            System.out.println("Nenhuma turma cadastrada");
                        }
                    }

                    break;
                case 3:
                    System.out.println("- - - Cadastro de Notas - - -");
                    System.out.println("Alunos cadastrados");
                    if (alunos.size() != 0) {
                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.printf("%d - %s\n", alunos.get(i).getIdAluno(), alunos.get(i).getNomeAluno());
                        }
                        for (int j = 0; j < qtdAlunos; j++) {
                            System.out.print("Informe o ID do Aluno: ");
                            int alunoopcao = input.nextInt();
                            if (alunos.contains(alunos.get(alunoopcao - 1))) {
                                System.out.print("Informe a 1ª nota: ");
                                alunos.get(alunoopcao - 1).setN1(input.nextInt());
                                System.out.print("informe a 2ª nota: ");
                                alunos.get(alunoopcao - 1).setN2(input.nextInt());
                                System.out.print("informe a 3ª nota: ");
                                alunos.get(alunoopcao - 1).setN3(input.nextInt());
                                alunos.get(alunoopcao - 1).situacao(alunos.get(alunoopcao - 1).getN1(), alunos.get(alunoopcao - 1).getN2(), alunos.get(alunoopcao - 1).getN3());
                            } else {
                                System.out.println("ID de aluno inválido");
                            }
                        }
                    } else {
                        System.out.println("Nenhum aluno cadastrado");
                    }

                    break;
                case 4:
                    System.out.println("- - - Gerar Relatório - - -");
                    System.out.println("Turmas Disponíveis ");
                    for (int j = 0; j < qtdTurmas; j++) {
                        System.out.printf("%d - %s\n", turmas.get(j).getIdTurma(), turmas.get(j).getNomeTurma());
                    }
                    System.out.print("Selecione a turma: ");
                    int turmaRelatorio = input.nextInt();
                    if (turmaRelatorio >= 1 && turmaRelatorio <= qtdTurmas) {
                        turmas.get(turmaRelatorio - 1).gerarRelatorio();
                    } else {
                        System.out.println("ID de turma inválido");
                    }
                    break;
                case 5:
                    System.out.println("*** Até breve ***");
                    break;
                default:
                    System.out.println("Selecione uma opção válida");
                    break;
            }

        }
    }
}
