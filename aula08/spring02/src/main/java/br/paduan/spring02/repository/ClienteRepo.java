package br.paduan.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.Cliente;

// CRUD - Creat, Read, Update, Delete
public interface ClienteRepo extends CrudRepository<Cliente, Integer> {
}
