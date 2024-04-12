package com.kata;

public class RockPaperScissors {
    public static final String PLAYER1 = "Player 1 Won!";
    public static final String PLAYER2 = "Player 2 Won!";
    public static final String DRAW = "Draw!";

    public enum GameChoice {
        ROCK, PAPER, SCISSORS, LIZARD, SPOCK;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public static String rpsls(String player1, String player2) {
        if (player1.equals(GameChoice.ROCK.toString())) {
            if (player2.equals(GameChoice.PAPER.toString())) {
                return PLAYER2;
            } else if (player2.equals(GameChoice.SCISSORS.toString())) {
                return PLAYER1;
            } else if (player2.equals(GameChoice.LIZARD.toString())) {
                return PLAYER1;
            } else if (player2.equals(GameChoice.SPOCK.toString())) {
                return PLAYER2;
            } else {
                return DRAW;
            }
        } else if (player1.equals(GameChoice.PAPER.toString())) {
            if (player2.equals(GameChoice.ROCK.toString())) {
                return PLAYER1;
            } else if (player2.equals(GameChoice.SCISSORS.toString())) {
                return PLAYER2;
            } else if (player2.equals(GameChoice.LIZARD.toString())) {
                return PLAYER2;
            } else if (player2.equals(GameChoice.SPOCK.toString())) {
                return PLAYER1;
            } else {
                return DRAW;
            }
        } else if (player1.equals(GameChoice.SCISSORS.toString())) {
            if (player2.equals(GameChoice.PAPER.toString())) {
                return PLAYER1;
            } else if (player2.equals(GameChoice.ROCK.toString())) {
                return PLAYER2;
            } else if (player2.equals(GameChoice.LIZARD.toString())) {
                return PLAYER1;
            } else if (player2.equals(GameChoice.SPOCK.toString())) {
                return PLAYER2;
            } else {
                return DRAW;
            }
        } else if (player1.equals(GameChoice.LIZARD.toString())) {
            if (player2.equals(GameChoice.PAPER.toString())) {
                return PLAYER1;
            } else if (player2.equals(GameChoice.ROCK.toString())) {
                return PLAYER2;
            } else if (player2.equals(GameChoice.SCISSORS.toString())) {
                return PLAYER2;
            } else if (player2.equals(GameChoice.SPOCK.toString())) {
                return PLAYER1;
            } else {
                return DRAW;
            }
        } else if (player1.equals(GameChoice.SPOCK.toString())) {
            if (player2.equals(GameChoice.PAPER.toString())) {
                return PLAYER2;
            } else if (player2.equals(GameChoice.ROCK.toString())) {
                return PLAYER1;
            } else if (player2.equals(GameChoice.SCISSORS.toString())) {
                return PLAYER1;
            } else if (player2.equals(GameChoice.LIZARD.toString())) {
                return PLAYER2;
            } else {
                return DRAW;
            }
        } else {
            return DRAW;
        }
    }
}

//Solution 2
class RockPaperScissors2 {
    public static final String PLAYER1 = "Player 1 Won!";
    public static final String PLAYER2 = "Player 2 Won!";
    public static final String DRAW = "Draw!";


    public static String rpsls(String player1, String player2) {
        if (player1.equals(player2)) {
            return DRAW;
        }

        switch (player1) {
            case "rock" -> {
                switch (player2) {
                    case "scissors", "lizard" -> {
                        return PLAYER1;
                    }
                    case "paper", "spock" -> {
                        return PLAYER2;
                    }
                }
            }
            case "paper" -> {
                switch (player2) {
                    case "rock", "spock" -> {
                        return PLAYER1;
                    }
                    case "scissors", "lizard" -> {
                        return PLAYER2;
                    }
                }
            }
            case "scissors" -> {
                switch (player2) {
                    case "paper", "lizard" -> {
                        return PLAYER1;
                    }
                    case "rock", "spock" -> {
                        return PLAYER2;
                    }
                }
            }
            case "lizard" -> {
                switch (player2) {
                    case "paper", "spock" -> {
                        return PLAYER1;
                    }
                    case "rock", "scissors" -> {
                        return PLAYER2;
                    }
                }
            }
            case "spock" -> {
                switch (player2) {
                    case "rock", "scissors" -> {
                        return PLAYER1;
                    }
                    case "paper", "lizard" -> {
                        return PLAYER2;
                    }
                }
            }
        }
        return DRAW;
    }
}
