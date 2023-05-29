/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackathon;

/**
 *
 * @author programador
 */
public class Aluno {
    private int idAluno;
    private String nomeAluno;
    private Turma idTurma;
    private double n1 = 0,n2 = 0,n3 = 0;
    private double media = 0;
    
    
    public Aluno(){}

    public Aluno(int idAluno, String nomeAluno, Turma turma, double n1, double n2, double n3, double media) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.idTurma = turma;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.media = media;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Turma getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Turma idTurma) {
        this.idTurma = idTurma;
    }

    public double getMedia() {
        media = n1 + n2 + n3/3;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
   void situacao(double n1, double n2, double n3){
        media = (n1 + n2 + n3)/ 3;
         if(media >= 7){
             System.out.println("Média final: " + media + "\nAluno Aprovado!");
         }else{
             System.out.println("Média final: " + media + "\nAluno Reprovado!");
         }
    }
            
}
