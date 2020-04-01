package ExerciciosAula5;
public class Turma{
    //ATRIBUTOS DA TURMA
    private String nome;
    private String curso;
    private int quantidadeDeAlunos;
    private int serie;

    //MÉTODO CONSTRUTOR
    public Turma(String n, String c, int qnt, int s){
        nome = n;
        curso = c;
        quantidadeDeAlunos = qnt;
        serie = s;
    }

    //METODOS DE ACESSO
    public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }
    public int getQuantidadeDeAlunos(){
        return quantidadeDeAlunos;
    }
    public int getSerie(){
        return serie;
    }

    //METODOS MODIFICADORES
    public void setNome(String n){
        nome = n;
    }
    public void setCurso(String c){
        curso = c;
    }
    public void setQuantidadeDeAlunos(int qnt){
        quantidadeDeAlunos = qnt;
    }
    public void setSerie(int s){
        serie = s;
    }

}