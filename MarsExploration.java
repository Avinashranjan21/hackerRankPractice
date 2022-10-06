public class MarsExploration {
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
        System.out.println(marsExploration("SOSSOT"));
    }

    public static int marsExploration(String s) {
        int missingSignalCount = 0;
        int numberOfSos = s.length() / 3;
        String sos = "SOS";
        for (int i = 0; i < sos.length(); i++) {
            String alphabet = String.valueOf(sos.charAt(i));
            for (int j = 0; j < numberOfSos; j++) {
                if (!alphabet.equals(String.valueOf(s.charAt(j * sos.length() + i)))) {
                    missingSignalCount++;
                }
            }
        }
        return missingSignalCount;
    }
}
