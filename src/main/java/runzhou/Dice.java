package runzhou;

public class Dice {
    private int die1;
    private int die2;

    public int timesBeforeDouble = 1;

    public void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + getDie1());
        System.out.println("Die 2: " + getDie2());

        if (isDouble()) {
            System.out.println("You rolled a double!");
            System.out.println("After " + timesBeforeDouble + " try both reach the same value");
        } else {
            System.out.println("You didn't roll a double!");
        }
        countTimesBeforeDouble(isDouble());
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public void countTimesBeforeDouble(Boolean b) {
        if (!b) {
            timesBeforeDouble++;
        } else {
            timesBeforeDouble = 1;
        }
    }
}
