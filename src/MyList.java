import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size;
    private final static int DEFAULT_CAPACITY =10;
    private Object[] element;

    public MyList() {
        this.element =  new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            this.element = new Object[capacity];
        }else if (capacity == 0) {
            this.element = new Object[DEFAULT_CAPACITY];
        }else {
            throw new IllegalArgumentException("Exception");
        }
    }

    public void add(int index, E element) {
        ensureCapacity();
            for (int i = size -1; i >= index ; i--) {
                this.element[i+1] = this.element[i];
            }
            this.element[index] = element;
        size++;
    }

    private void ensureCapacity() {
        if (size >= element.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(element, 0, newData, 0, size);
            element = newData;
        }
    }

    public E remove(int index){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Exception " + index + "out of bounds");
        }
        E element = (E) this.element[index];
        for (int i = index; i < size -1 ; i++) {
            this.element[i] = this.element[i + 1];
        }
        this.element[size -1 ] = null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public E clone() {
//        try {
//            ArrayList<?> v = (ArrayList<?>) super.clone();
//            v.element = Arrays.copyOf(element, size);
//
            return clone();
//        } catch (CloneNotSupportedException e) {
//            // this shouldn't happen, since we are Cloneable
//            throw new InternalError(e);
//        }

    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(this.element[i]))
                return true;
        return false;
    }
}
