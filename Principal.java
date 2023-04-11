public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe");
        System.out.println(pessoa.getNome());

        pessoa.setIdade(18);
        System.out.println(pessoa.getIdade());

        pessoa.setCelular("(18)99634-1508");
        System.out.println(pessoa.getCelular());
        pessoa.setCpf("493.236.238-22");
        System.out.println(pessoa.getCpf());
    }
}
