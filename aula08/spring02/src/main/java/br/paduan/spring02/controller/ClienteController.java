package br.paduan.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.spring02.model.Cliente;
import br.paduan.spring02.repository.ClienteRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepo repo;

    @GetMapping("/id/{id}") // {id} é uma variável chamada 'id'
    public ResponseEntity<Cliente> buscaCliente(@PathVariable int id) {
        Cliente clienteEncontrado = repo.findById(id).orElse(null); //findById = busca pela chave primária

        if(clienteEncontrado != null) { // encontrou o cliente
            return ResponseEntity.ok(clienteEncontrado); // ok = status 200
        }

        return ResponseEntity.notFound().build(); //notFound = status 404
    }


    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> buscarTodos() {
        List<Cliente> lista = (List<Cliente>) repo.findAll();

        return ResponseEntity.ok(lista);
    }
}
