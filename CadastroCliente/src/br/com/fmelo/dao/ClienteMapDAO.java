package br.com.fmelo.dao;

import br.com.fmelo.domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteHashSetDAO implements IClienteDAO {

    private Set<Cliente> clientes;

    public ClienteHashSetDAO() {
        this.clientes = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        // Adiciona cliente ao HashSet se não houver outro com o mesmo CPF
        return this.clientes.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        // Remove cliente com base no CPF
        Cliente clienteParaRemover = consultar(cpf);
        if (clienteParaRemover != null) {
            this.clientes.remove(clienteParaRemover);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        // Remove o cliente antigo e adiciona o atualizado
        Cliente clienteExistente = consultar(cliente.getCpf());
        if (clienteExistente != null) {
            this.clientes.remove(clienteExistente);
            this.clientes.add(cliente);
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        // Procura um cliente com o CPF fornecido
        for (Cliente cliente : this.clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        // Retorna todos os clientes
        return this.clientes;
    }
}