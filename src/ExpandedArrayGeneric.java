import java.util.Arrays;

public class ExpandedArrayGeneric<T> {
    Object[] data = new Object[3];
    int lastIndex = 0;

    public int addElement(T element) {
        if (lastIndex >= data.length)
            expandData();

        data[lastIndex] = element;
        return lastIndex++;
    }

    public T getElementByIndex(int index){
        return (T)data[index];
    }

    private void expandData() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public boolean removeElementByIndex(int index) {
        if (index < 0 || index >= lastIndex) {
            return false;
        }
        for (int i = index; i < lastIndex; i++) {
            data[i] = data[i + 1];
        }
        data[--lastIndex] = null;
        return true;
    }

    public boolean removeByValue(T element){
        for (int i = 0; i < lastIndex; i++) {
            if (data[i].equals(element)){
                return removeElementByIndex(i);
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < lastIndex; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void forEach(Operation<T> operation){
        for (int i = 0; i < lastIndex; i++) {

            operation.doOperation((T)data[i]);
        }

    }

}
