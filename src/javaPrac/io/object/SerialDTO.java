package javaPrac.io.object;

import java.io.Serializable;

public class SerialDTO implements Serializable {

    private String bookName;
    private int bookOrder;
    private boolean bestSeller;
    private long soldPerDat;
    private String bookType = "IT";
    static final long serialVersionUID = 1L;

    public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDat) {
        super();
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDat = soldPerDat;
    }

    @Override
    public String toString() {
        return "SerialDTO{" +
                "bookName='" + bookName + '\'' +
                ", bookOrder=" + bookOrder +
                ", bestSeller=" + bestSeller +
                ", soldPerDat=" + soldPerDat +
                '}';
    }
}
