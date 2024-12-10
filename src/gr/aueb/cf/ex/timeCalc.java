package gr.aueb.cf.ex;

public class timeCalc {
    public static void main(String[] args) {
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;
        double stringBuilderElapsedTime = 0.0;
        StringBuilder sb = new StringBuilder();

        timeStart = System.currentTimeMillis();

        for (int i = 1; i <= 500_000; i++){
            concatStr = concatStr + i;
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;


        timeStart = System.currentTimeMillis();

        for (int i = 1; i <= 500_000; i++){
            sb.append(i);
//            concatStr = concatStr + i;
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String elapsed time: " + elapsedTime + " seconds");

        System.out.println("sb elapsed time: " + stringBuilderElapsedTime + "seconds ");

    }
}
