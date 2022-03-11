package com.tarktech.training.ipl;

import com.tarktech.training.ipl.domain.CricketMatch;
import com.tarktech.training.ipl.domain.Team;
import com.tarktech.training.ipl.domain.Tournament;
import com.tarktech.training.ipl.util.PrettyPrinter;
import com.tarktech.training.ipl.util.TeamRepository;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TeamRepository teamRepository = new TeamRepository();

        List<Team> teams = teamRepository.findAllTeams();
        PrettyPrinter.printTeamDetails(teams);
        LocalDate tournamentStartDate = LocalDate.of(2022, 3, 15);

        Tournament tournament = new Tournament(teams, tournamentStartDate);

        tournament.scheduleLeagueRound();
        List<CricketMatch> playedMatches = tournament.playLeagueRound();
        PrettyPrinter.printMatchResult(playedMatches);

        tournament.scheduleSemifinals();
        tournament.playSemifinals();

        tournament.scheduleFinal();
        tournament.playFinal();

    }
}
