package academy.learnprograming;

public class SoPhuc {

    private double phanThuc;
    private double phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    @Override
    public String toString() {

        if (phanAo == 0) {
            return phanThuc + "";
        } else if (phanThuc == 0) {
            return phanAo + "i";
        }

        return "(" + phanThuc + " + " + phanAo + "i)";
    }
}
