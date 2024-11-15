public class MyList {
    int[] array = new int[100];
    int size = 100;
    int length = 0;
    void add(int value){
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

    void deleteByValue(int value){
        int index = -1;
        for(int i=0;i<length;i++){
            if (array[i]==value){
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

    int get(int index){
        if (index >= 0 && index < length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    void expandOrShrink(int newSize){
        int[] newArray = new int[newSize];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        size = newSize;
    }
}
