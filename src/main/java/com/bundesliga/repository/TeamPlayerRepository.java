package com.bundesliga.repository;

import com.bundesliga.entity.TeamPlayer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamPlayerRepository extends JpaRepository<TeamPlayer, Long> {
}
