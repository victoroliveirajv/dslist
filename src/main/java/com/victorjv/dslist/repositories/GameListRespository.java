package com.victorjv.dslist.repositories;

import com.victorjv.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRespository extends JpaRepository<GameList, Long> {
}
