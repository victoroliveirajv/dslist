package com.victorjv.dslist.services;

import com.victorjv.dslist.dto.GameDTO;
import com.victorjv.dslist.dto.GameMinDTO;
import com.victorjv.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;


    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        return new GameDTO(repository.findById(id).orElseThrow(() -> new RuntimeException("Id não encontrado")));

    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return repository.findAll().stream().map(GameMinDTO::new).toList();
    }
}
