package behavior.iterator;

public class NameRepository implements Container {
    private String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        private int index;

        @Override
        public boolean hasNext() {
            if(index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
