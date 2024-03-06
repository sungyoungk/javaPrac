package javaPrac.ReferenceType;

public class ReferenceReturn {

    public static void main(String[] args) {
        ReferenceReturn referenceReturn = new ReferenceReturn();

        referenceReturn.intReturn();
        referenceReturn.intArrayReturn();
        referenceReturn.stringReturn();
    }

    public int intReturn() {
        int returnInt = 0;
        return returnInt;
    }

    public int[] intArrayReturn() {
        int[] intArray = new int[10];
        return intArray;
    }

    public String stringReturn() {
        String returnString = "Return Value";
        return returnString;
    }

    public void wantToStopInTheMiddle(boolean flag){
        if (!flag) {

        } return;
    }
}
