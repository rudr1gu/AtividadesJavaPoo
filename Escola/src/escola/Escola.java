package escola;

public class Escola {
  
    public static void main(String[] args) {
        
            //Pessoa p1 = new Pessoa("Pedro", 247350);
            //Criei uma classe pessoa e atribui dois elementos construtor: Nome e Numero de cadastro

            Professor prf1 = new Professor("Guanabara", 102030);
            //Criei uma classe Professor que pertence a classe Pessoa 
            //A Classe Professor recebe os atributo construtor da classe Pessoa
            Professor prf2 = new Professor("Xavier", 102031);
            Professor prf3 = new Professor("Jiraya", 102032);

            prf1.materia = "Desenvolvimento Web 1";
            //A Classe Professor tem um atributo Individual que é Matéria
            prf2.materia = "Banco de Dados";
            prf3.materia = "Desing";

            System.out.println("O Professor: " + prf1.nome + " do Componente Curricular de: " + prf1.materia + 
                    " Recebeu o cadastro como o numero: " + prf1.numCadastro );
            //Verificando se os dados foi atribuido

            Aluno a1 = new Aluno("Luffy", 202020);
            Aluno a2 = new Aluno("Zoro", 202022);
            Aluno a3 = new Aluno("Sanji", 202024);    

            a1.notaFinal = 10;
            a2.notaFinal = 4;
            a3.notaFinal = 9;

            a1.numSala = 8;
            a2.numSala = 8;
            a3.numSala = 8;

            System.out.println("O Aluno: " + a1.nome + " Recebeu a Nota: " + a1.notaFinal);
            System.out.println("O Aluno: " + a2.nome + " Recebeu a Nota: " + a2.notaFinal);
            System.out.println("O Aluno: " + a3.nome + " Recebeu a Nota: " + a3.notaFinal);

             // Verifica a aprovação de cada aluno
            a1.isAprovacao();
            a2.isAprovacao();
            a3.isAprovacao();

            System.out.println("O Aluno " + a1.nome + " Foi: " + a1.getStatusAprovacao());
            System.out.println("O Aluno " + a2.nome + " Foi: " + a2.getStatusAprovacao());
            System.out.println("O Aluno " + a3.nome + " Foi: " + a3.getStatusAprovacao());

            Administracao adm1 = new Administracao("Junior", 505050);
            Administracao adm2 = new Administracao("Jéssica", 507060);
            Administracao adm3 = new Administracao("Julio", 505060);

            adm1.funcao = "Diretor";
            adm2.funcao = "Secretária";
            adm3.funcao = "Coordenador";

            System.out.println(adm1.nome +" é o "+ adm1.funcao + " da Escola: " + Pessoa.nomeEscola);
            System.out.println(adm2.nome +" é a "+ adm2.funcao + " da Escola: " + Pessoa.nomeEscola);
            System.out.println(adm3.nome +" é o "+ adm3.funcao + " da Escola: " + Pessoa.nomeEscola);
    
    }
    
}