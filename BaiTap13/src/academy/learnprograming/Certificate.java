package academy.learnprograming;

public class Certificate {

    private String certificatedID;
    private String certificateName;
    private String certificateRank;
    private String certificatedDate;

    public Certificate(String certificatedID, String certificateName, String certificateRank, String certificatedDate) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
    }

    @Override
    public String toString() {
        return "\nBằng cấp ID: " + certificatedID + "\nTên bằng cấp: " + certificateName +
                "\nXếp loại: " + certificateRank + ". Ngày cấp: " + certificatedDate;
    }
}
