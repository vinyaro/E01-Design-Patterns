package strategy;

public class PasswordValidator {
    
    // Guardamos a estratégia escolhida aqui
    private PasswordStrategy strategy;

    // Método para definir ou trocar a estratégia a qualquer momento
    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        // Se nenhuma estratégia foi definida, não temos como validar
        if (strategy == null) {
            System.out.println("Erro: Nenhuma estratégia de validação definida!");
            return false;
        }
        
        // Delegamos a validação para a estratégia que estiver configurada
        return strategy.validate(password);
    }
}