package pl.edu.pja;

public class MyList<E> {

    private final E[] array;
    private int lastIndex;

    public MyList()
    {

        array = (E[]) new Object[20];
    }

    public boolean add(E element)
    {
        try {
            array[lastIndex] = element;
            lastIndex++;
            return true;
        } catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }

    public int size(){
        return array.length;
    }

    public boolean contains(final E element) {
        for(E item : array)
        {
            if(item == element)
            {
                return true;
            }
        }
        return false;
    }

    public int indexOf(final E element) {
        for (int i = 0; i < array.length; i++) {
            final E item = element;
            if (item.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(final E element) {
        for (int i = array.length - 1; i >= 0; i--) {
            final E item = element;
            if (item.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public E get(final int index) {
        try
        {
            return array[index];
        }catch (IndexOutOfBoundsException e)
        {
            throw e;
        }
    }

    public void set(final int index, final E value) {
        get(index);
        array[index] = value;
    }
}
