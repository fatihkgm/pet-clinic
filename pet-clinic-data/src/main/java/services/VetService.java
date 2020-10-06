package services;

import java.util.Set;

import model.Vet;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set findAll();
}