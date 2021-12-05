public class AgeSorter extends TemplateMethod{


    public void bubbleSort(Person[] p){
        sort(p);
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
