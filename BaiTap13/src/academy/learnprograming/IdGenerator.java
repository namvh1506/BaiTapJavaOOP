package academy.learnprograming;

public class IdGenerator {
    private int maChuCai = 26;
    private int id = 0;
    final int LENGTH = 4;


    public int taoSoNgauNhien(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


    public String taoMaChuCai(int i) {
        return i < 0 ? "" : taoMaChuCai((i / 26) - 1) + (char)(65 + i % 26);
    }


    public String generateId() {

        id = id + taoSoNgauNhien(1, 9999);
        if (id > 10000) {
            id = id - 10000;
            maChuCai++;
        }

        String stringId = String.valueOf(id);
        String zeroString = "";

        if (stringId.length() < LENGTH) {
            for (int i = 0; i < (LENGTH - stringId.length()); i++) {
                zeroString = zeroString + "0";
            }
        }
        return taoMaChuCai(maChuCai) + zeroString + stringId;
    }
}
