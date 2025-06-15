package com.bundesliga.controller;


import com.bundesliga.entity.Player;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bundesliga.service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/api/player")
@AllArgsConstructor
public class PlayerController {

    private PlayerService playerService;

    // POST Mapping - Adding players


    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers(){
        List<Player> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @GetMapping("{id}")
    public ResponseEntity<Player> getById(@PathVariable("id") Long id) {
        Player player = playerService.getById(id);
        return ResponseEntity.ok(player);
    }



}
