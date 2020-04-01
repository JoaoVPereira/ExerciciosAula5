package ExerciciosAula5;
import javax.swing.*;

public class TesteTurma{
    public static void main(String...args){
        //COLETANDO OS DADOS DA TURMA
        String nome = JOptionPane.showInputDialog("Digite nome");
        String curso = JOptionPane.showInputDialog("Digite o curso"); 
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a série"));

        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);
        //MOSTRANDO OS DADOS
        String s = turma.getNome() + "\n" + turma.getCurso() + "\n" + turma.getQuantidadeDeAlunos() + "\n"+ turma.getSerie();
        JOptionPane.showMessageDialog(null, s);

        //MUDANDO O VALOR DA VARIAVEL
        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos"));
        turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
        JOptionPane.showMessageDialog(null, s);


    }
}