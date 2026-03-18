package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void add(Observer observer) {
        // TODO: adicionar observer para ser notificado posteriormente
        // Simplesmente adicionamos o observador que chegou à nossa lista
        this.observers.add(observer);
    }

    public void notifyObservers() {
        // TODO: notificar observers adicionados
        // Percorremos a lista e chamamos o método update de cada um deles
        // Passamos 'this' (o próprio Subject) para que o observador saiba quem mudou
        for (Observer ob : observers) {
            ob.update(this);
        }
    }
}