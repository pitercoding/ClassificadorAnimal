package service;

import model.Animal;
import model.Filo;
import java.util.ArrayList;
import java.util.List;

public class AnimalService {

    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal a : animais) {
                System.out.println(a);
            }
        }
    }

    public void buscarPorFilo(Filo filo) {
        boolean encontrado = false;
        for (Animal a : animais) {
            if (a.getFilo() == filo) {
                System.out.println(a);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum animal encontrado para esse filo.");
        }
    }
}

