package leet_code;

public class _2038_RemovedColoredPieces_AnotherSolution {
    public static boolean winnerOfGame(String colors) {
        int alice = 0, bob = 0;
        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == 'A') {
                    alice += 1;
                }
                if (colors.charAt(i) == 'B') {
                    bob += 1;
                }
            }
        }
        return alice > bob;
    }

    public static void main(String[] args) {

        String colors = "AAA";
        System.out.println(winnerOfGame(colors));
    }
}
