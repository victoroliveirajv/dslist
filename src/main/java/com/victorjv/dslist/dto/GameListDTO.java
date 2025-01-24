package com.victorjv.dslist.dto;


import com.victorjv.dslist.entities.GameList;

public record GameListDTO(Long id, String name) {

    public GameListDTO(GameList entity){
        this(entity.getId(), entity.getName());
    }
}
