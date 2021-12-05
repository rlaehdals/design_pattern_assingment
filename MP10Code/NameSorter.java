public class NameSorter extends TemplateMethod{

	public void bubbleSort(Person[] data) {
        sort(data);
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
