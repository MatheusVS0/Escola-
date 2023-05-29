/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackathon;

import java.util.ArrayList;

/**
 *
 * @author programador
 */
public class Turma {

    private int idTurma;
    private String nomeTurma;
    private int qtdAlunos;
    private ArrayList <Aluno> alunosTurma = new ArrayList<>();
    
    public Turma(){}

    public Turma(int idTurma, String nomeTurma, int qtdAlunos) {
        this.idTurma = idTurma;
        this.nomeTurma = nomeTurma;
        this.qtdAlunos = qtdAlunos;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
    
    public void addAluno(Aluno aluno){
        alunosTurma.add(aluno);
    }
    
    public void gerarRelatorio() {
    System.out.println("Relatório da Turma: " + nomeTurma);
    for (Aluno aluno : alunosTurma) {
        System.out.println("-------------------------");
        System.out.println("Nome: " + aluno.getNomeAluno());
        aluno.situacao(aluno.getN1(), aluno.getN2(), aluno.getN3());
        System.out.println("-------------------------");
    }
}
}
