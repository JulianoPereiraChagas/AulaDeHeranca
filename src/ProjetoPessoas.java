public class ProjetoPessoas {

    public static void main(String[] args) {

        System.out.println("\n");

        // Pessoas

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        // Nomes das pessoas

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiano");

        // Idade das pessoas

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("M");

        // Idade das pessoas

        p1.setIdade("18");
        p2.setIdade("20");
        p3.setIdade("25");
        p4.setIdade("24");

        // Função de cada um

        p2.setCurso("Informatica");
        p3.setSalario("2500.75");
        p4.setSetor("Estoque");

        // p1.receberAum("550l.20");
        // p2.mudarTrabalho();
        // p4.cancelarMatri();
        // essas daqui de cima estão erradas!!!

        // Apresentação geral das pessoas

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("\n");
    }
}