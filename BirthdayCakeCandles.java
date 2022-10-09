import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(Arrays.asList(3, 2, 1, 3)));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallestCandleNumber = 0;
        int tallestCandle = candles.get(0);
        for (Integer candle : candles) {
            if (tallestCandle == candle) {
                tallestCandleNumber++;
            } else if (candle > tallestCandle) {
                tallestCandle = candle;
                tallestCandleNumber = 1;
            }
        }
        return tallestCandleNumber;
    }
}
