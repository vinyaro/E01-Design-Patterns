package strategy;

public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String minhaSenha = "Senha123@";

        // Testando a regra de Tamanho
        validator.setStrategy(new LengthStrategy());
        System.out.println("Possui 8 caracteres? " + validator.validate(minhaSenha));

        // Testando a regra de Maiúscula
        validator.setStrategy(new UpperCaseStrategy());
        System.out.println("Possui letra maiúscula? " + validator.validate(minhaSenha));

        // Testando a regra de Especial
        validator.setStrategy(new SpecialCharStrategy());
        System.out.println("Possui caractere especial? " + validator.validate(minhaSenha));
    }
}