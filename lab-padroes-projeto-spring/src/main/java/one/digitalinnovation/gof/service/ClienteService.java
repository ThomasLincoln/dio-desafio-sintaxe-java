package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Client;

public interface ClienteService {
  Iterable<Client> buscarTodos();

  Client buscarPorID(Long id);

  void inserir(Client cliente);

  void atualizar(Long id, Client cliente);

  void deletar(Long id);
}
