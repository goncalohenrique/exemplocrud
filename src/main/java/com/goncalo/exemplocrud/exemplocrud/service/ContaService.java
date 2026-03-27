package com.goncalo.exemplocrud.exemplocrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goncalo.exemplocrud.exemplocrud.repository.ContaRepository;
import com.goncalo.exemplocrud.exemplocrud.model.Conta;

@Service
public class ContaService {
    
    @Autowired
    private ContaRepository contaRepository;
    
    public List<Conta> buscarTodas() {
        return contaRepository.findAll();
    }
    
    public Optional<Conta> buscarPorId(Long id) {
        return contaRepository.findById(id);
    }
    
    public List<Conta> buscarPorUsuario(Long usuarioId) {
        return contaRepository.findByTitularId(usuarioId);
    }
    
    public Conta salvar(Conta conta) {
        return contaRepository.save(conta);
    }
    
    public void deletar(Long id) {
        contaRepository.deleteById(id);
    }
}
