package com.victorjv.dslist.controllers;


import com.victorjv.dslist.dto.GameListDTO;
import com.victorjv.dslist.dto.GameMinDTO;
import com.victorjv.dslist.services.GameListService;
import com.victorjv.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll(){

        return ResponseEntity.ok(gameListService.findAll());
    }

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId){

        return ResponseEntity.ok(gameService.findByList(listId));
    }

}
