package com.victorjv.dslist.dto;

import com.victorjv.dslist.entities.Game;
import com.victorjv.dslist.projections.GameMinProjection;

public record GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public GameMinDTO(Game entity){
        this(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getImgUrl(),
                entity.getShortDescription());
    }

    public GameMinDTO(GameMinProjection projection){
        this(
                projection.getId(),
                projection.getTitle(),
                projection.getYear(),
                projection.getImgUrl(),
                projection.getShortDescription());
    }
}
