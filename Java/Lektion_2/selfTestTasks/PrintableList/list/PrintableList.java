package Java.Lektion_2.selfTestTasks.PrintableList.list;

import Java.Lektion_2.selfTestTasks.PrintableList.interfaces.Printable;

public class PrintableList {
    private Entry header = new Entry(null, null, null);
    private int size;

    public PrintableList() {
        header.next = header;
        header.previous = header;
    }

    public void add(Printable p) {
        Entry newEntry = new Entry(p, header, header.previous);
        header.previous.next = newEntry;
        header.previous = newEntry;
        size++;
    }

    public int size() {
        return size;
    }

    public class ListIterator {
        private Entry next = header.next;

        public boolean hasNext() {
            return next != header;
        }

        public Printable next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            Printable element = next.element;
            next = next.next;
            return element;
        }
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    private static class Entry {
        Printable element;
        Entry next;
        Entry previous;

        Entry(Printable element, Entry next, Entry previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
}
