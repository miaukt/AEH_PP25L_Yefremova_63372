package pl.pp;

public class MojaDziesiataAplikacja {
        public static void main(String[] args) {
            int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
            int[] result = countAndSumElements(input);
            System.out.println("{" + result[0] + ", " + result[1] + "}");
        }

        public static int[] countAndSumElements(int[] input) {
            if (input == null || input.length == 0) {
                return new int[0];
            }

            int negativeCount = 0;
            int positiveSum = 0;

            for (int number : input) {
                if (number < 0) {
                    negativeCount++;
                } else if (number > 0) {
                    positiveSum += number;
                }
            }

            return new int[]{negativeCount, positiveSum};
        }
    }
