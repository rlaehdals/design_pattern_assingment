package compare;

public class CompareFileType implements Comparable{
    @Override
    public int compareTo(Object o1, Object o2) {

        FileInfo file1 = (FileInfo) o1;
        FileInfo file2 = (FileInfo) o2;
        return file1.getType().compareTo(file2.getType());
    }
    void bubbleSortStrings(String[] data2) {
        for (int i = 0; i < data2.length - 1; i++) {
            for (int j = 0; j < data2.length - i - 1; j++) {
                if (data2[j].compareTo(data2[j + 1]) > 0) { // swap
                    String temp = data2[j];
                    data2[j] = data2[j + 1];
                    data2[j + 1] = temp;
                }
            }
        }
    }
}
