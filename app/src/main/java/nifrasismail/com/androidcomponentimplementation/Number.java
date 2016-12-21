package nifrasismail.com.androidcomponentimplementation;

/**
 * Created by techorin on 12/20/16.
 */

public class Number {
    private int number,multiplication;

    public Number(int number, int multiplication) {
        this.number = number;
        this.multiplication = multiplication;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }
}
