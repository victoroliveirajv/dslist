package com.victorjv.dslist.controllers;

import com.victorjv.dslist.dto.GameDTO;
import com.victorjv.dslist.dto.GameMinDTO;
import com.victorjv.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<GameDTO> findById(@PathVariable Long id){

        return ResponseEntity.ok(gameService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll(){

        return ResponseEntity.ok(gameService.findAll());
    }
}
