package pl.emdzej.lottery;

import java.util.ArrayList;
import java.util.List;

public class LotteryResults
{
    List<Integer> choosenNumbers = new ArrayList<>();
    List<Integer> randomNumbers = new ArrayList<>();
    List<Integer> matchNumbers = new ArrayList<>();

    public LotteryResults(List<Integer> choosenNumbers, List<Integer> randomNumbers, List<Integer> matchNumbers) {
        this.choosenNumbers = choosenNumbers;
        this.randomNumbers = randomNumbers;
        this.matchNumbers = matchNumbers;
    }

    public List<Integer> getChoosenNumbers() {
        return choosenNumbers;
    }

    public void setChoosenNumbers(List<Integer> choosenNumbers) {
        this.choosenNumbers = choosenNumbers;
    }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(List<Integer> randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public List<Integer> getMatchNumbers() {
        return matchNumbers;
    }

    public void setMatchNumbers(List<Integer> matchNumbers) {
        this.matchNumbers = matchNumbers;
    }
}
