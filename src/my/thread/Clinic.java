package my.thread;

import java.util.HashMap;
import java.util.Map;

public class Clinic {
    private Map<String,Card> registry;

    public Clinic() {
        registry = new HashMap<>();
    }

    public Card takeCard(String fio) {
        return registry.getOrDefault(fio,new Card(fio));
    }

    public Spravka visitDoctor(Card card) {
        try {
            enter();
            System.out.println("Patien card:" + card);
            Spravka spravka = new Spravka();
            exit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return
    }

    private void enter() throws InterruptedException {
        System.out.println("Enter Patient:" + Thread.currentThread().getName());
        Thread.sleep(2000);

    }
    private void exit() throws InterruptedException{
        System.out.println("Enter patient"  + Thread.currentThread().getName());
        Thread.sleep(1000);
    }

    public void putStamp(Spravka spravka) {
        spravka.setStampted(true);

    }
}


class Patient implements Runnable{

    private Clinic clinic;
    private String fio;

    public Patient(Clinic clinic,String fio) {
        this.clinic = clinic;
        this.fio = fio;
    }

    @Override
    public void run() {
        Card card = clinic.takeCard(fio);
        Spravka spravka = clinic.visitDoctor();
        clinic.putStamp(spravka);
    }
}

class Card {
    private String fio;

    public Card(String fio) {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}

class Spravka{
    private boolean isStampted = false;
    public boolean isStampted() {
        return isStampted;
    }

    public void setStampted(boolean stampted) {
        isStampted = stampted;
    }

    private boolean isStampted = false;
}