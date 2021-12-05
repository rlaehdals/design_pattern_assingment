import java.util.Comparator;

public abstract class TemplateMethod implements Comparator<Person> {

    public void sort(Person[] p){
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1; j++) {
                if (compare(p[j],p[j+1]) > 0) {
                    Person temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
    }
    @Override
    public abstract int compare(Person o1, Person o2);

}
