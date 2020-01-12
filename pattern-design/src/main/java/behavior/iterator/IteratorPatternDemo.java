package behavior.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        String[] names = {"Robert", "John", "Julie", "Lora"};

        NameRepository nameRepository = new NameRepository(names);
        for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            System.out.println((String)iterator.next());
        }
    }
}
