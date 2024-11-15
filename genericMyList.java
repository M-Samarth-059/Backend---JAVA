public class genericMyList <T> {
    int size = 100;
    Object[] array = new Object[size];

    int length = 0;
    void add(T value){
        if(length == size) {
            expandOrShrink(size * 2);
        }
        array[length] = value;
        length += 1;
    }
    void deleteByIndex(int index){
        if(index>=0 && index<length){
            for(int i=index;i<length-1;i++){
                array[i]=array[i+1];
            }
            length -= 1;
            if(length<size/4 && size > 100){
                expandOrShrink(size/2);
            }
        }else{
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

    }

    void deleteByValue(T value){
        int index = -1;
        for(int i=0;i<length;i++){
            if (array[i].equals(value)){
                index = i;
                break;
            }
        }
        if (index != -1) {
            deleteByIndex(index);
        } else {
            System.out.println("Value not found");
        }
    }

    T get(int index){
        if (index >= 0 && index < length) {
            return (T) array[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    void expandOrShrink(int newSize){
        Object[] newArray = new Object[newSize];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        size = newSize;
    }
}
