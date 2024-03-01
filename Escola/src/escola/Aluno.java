package escola;

public class Aluno extends Pessoa{
    
    int notaFinal;
    int numSala;
    String semestre;
    boolean aprovado;
    String verificacao;

    
    public Aluno(String nome, int numCadastro){
        super(nome, numCadastro);
    }

    // Método para verificar se o aluno foi aprovado
    public void isAprovacao() {
        if (notaFinal >= 5) {
            aprovado = true;
        } else {
            aprovado = false;
        }
    }

    // Método para obter o status de aprovação
    public String getStatusAprovacao() {
        return aprovado ? "Aprovado" : "Reprovado";
    }
    
}
