package com.victorjv.dslist.services;

import com.victorjv.dslist.dto.GameListDTO;
import com.victorjv.dslist.repositories.GameListRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRespository gameListRespository;

    public List<GameListDTO> findAll(){
        return gameListRespository.findAll().stream().map(GameListDTO::new).toList();
    }
}
