package model;

import controller.GameMenuController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    protected User me, enemy, winner, currentUser, nextUser;
    protected LocalDateTime date;
    protected int myFinalScore, enemyFinalScore, turnNumber, mylive, enemyLive;
    protected HashMap<Integer, ArrayList<Integer>> roundsScore = new HashMap<>();
    protected SpellUnit spellUnit;
    private GameMenuController controller;
    protected boolean mePassRound, enemyPassRound;
    protected static Game currentGame;


    public Game(User me, User enemy, LocalDateTime date) {
        this.me = me;
        this.enemy = enemy;
        this.date = date;
    }

    public String toJson() {
        return "{game(date<" + date.toString() + ">)(firstRound<" + roundsScore.get(0).get(0) + "/" + roundsScore.get(0).get(1) +
                ">)(secondRound<" + roundsScore.get(1).get(0) + "/" + roundsScore.get(1).get(1) + ">)(thirdRound<" +
                roundsScore.get(2).get(0) + "/" + roundsScore.get(2).get(1) + ">)(winner<" + winner.getUsername()+">)}";
    }

    public User getNextUser() {
        return nextUser;
    }

    public void setNextUser(User nextUser) {
        this.nextUser = nextUser;
    }

    public int getMylive() {
        return mylive;
    }

    public void setMylive(int mylive) {
        this.mylive = mylive;
    }

    public int getEnemyLive() {
        return enemyLive;
    }

    public void setEnemyLive(int enemyLive) {
        this.enemyLive = enemyLive;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Game.currentGame = currentGame;
    }

    public User getMe() {
        return me;
    }

    public void setMe(User me) {
        this.me = me;
    }

    public User getEnemy() {
        return enemy;
    }

    public void setEnemy(User enemy) {
        this.enemy = enemy;
    }

    public void setRoundsScore(HashMap<Integer, ArrayList<Integer>> roundsScore) {
        this.roundsScore = roundsScore;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    public boolean isMePassRound() {
        return mePassRound;
    }

    public void setMePassRound(boolean mePassRound) {
        this.mePassRound = mePassRound;
    }

    public boolean isEnemyPassRound() {
        return enemyPassRound;
    }

    public void setEnemyPassRound(boolean enemyPassRound) {
        this.enemyPassRound = enemyPassRound;
    }

    public User getWinner() {
        return winner;
    }

    public void setWinner(User winner) {
        this.winner = winner;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getMyFinalScore() {
        return myFinalScore;
    }

    public void setMyFinalScore(int myFinalScore) {
        this.myFinalScore = myFinalScore;
    }

    public int getEnemyFinalScore() {
        return enemyFinalScore;
    }

    public void setEnemyFinalScore(int enemyFinalScore) {
        this.enemyFinalScore = enemyFinalScore;
    }

    public HashMap<Integer, ArrayList<Integer>> getRoundsScore() {
        return roundsScore;
    }

    public void addToRoundsScore(Integer round, ArrayList<Integer> scores) {
        this.roundsScore.put(round, scores);
    }

    public SpellUnit getSpellUnit() {
        return spellUnit;
    }

    public void setSpellUnit(SpellUnit spellUnit) {
        this.spellUnit = spellUnit;
    }

    public GameMenuController getController() {
        return controller;
    }

    public void setController(GameMenuController controller) {
        this.controller = controller;
    }
}
