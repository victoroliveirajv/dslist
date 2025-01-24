package com.victorjv.dslist.services;

import com.victorjv.dslist.dtos.GameMinDTO;
import com.victorjv.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll(){

        return repository.findAll().stream().map(GameMinDTO::new).toList();
    }
}
