package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    // get all Matches
    List<Match> getAllMatches();

    // get live Matches
    List<Match> getLiveMatches();

    // get cricket world cup 2023 (cwc2023) point table
    List<List<String>> getPointTable();
}
