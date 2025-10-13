public class MyArraylist {
    private String[] array;
    private int size;
    private int capacity;

    public MyArraylist() {
        capacity = 10;
        array = new String[capacity];
        size = 0;
    }

    public void add(String value) {
        if (size == capacity) {
            resize();
        }
        array[size] = value;
        size++;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null; // Clear the last element
        size--;
    }

    public int size() {
        return size;
    }

    private void resize() {
        capacity = (int) (capacity * 1.5);
        String[] newArray = new String[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

}
