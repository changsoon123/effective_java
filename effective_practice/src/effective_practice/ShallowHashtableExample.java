package effective_practice;

import java.util.Hashtable;
import java.util.Map;

public class ShallowHashtableExample {

    public static void main(String[] args) {

    	HashTable hashTable1 = new HashTable();
        hashTable1.put(new HashTable.Entry("person1", 10, null));

        HashTable.Entry entry1 = new HashTable.Entry("person2", 20, null);
        HashTable.Entry entry2 = new HashTable.Entry("person3", 30, entry1);
        hashTable1.put(entry2);

        HashTable hashTable2 = hashTable1.clone();

        System.out.println("----------------hashTable1----------------");
        hashTable1.printAll();

        System.out.println("----------------hashTable2----------------");
        hashTable2.printAll();
    }
}

class HashTable implements Cloneable{
    private Entry[] buckets = new Entry[50];
    private int size = 0;

    public void put(Entry entry){
        buckets[size++] = entry;
    }

    public void printAll(){
        for (int i=0;i<size;i++){
            System.out.println(buckets[i].toString());
        }
    }

    static class Entry{
        final Object key;
        Object value;
        Entry next;

        public Entry(final Object key, final Object value, final Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Entry deepCopy(){
            return new Entry(key,value, next==null ? null : next.deepCopy());
        }
    }

    @Override
    protected HashTable clone() {
        try {
            HashTable result = (HashTable) super.clone();
            result.buckets = new Entry[buckets.length];

            for (int i =0; i < buckets.length; i++){
                if(buckets[i] != null){
                    result.buckets[i] = buckets[i].deepCopy();
                }
            }

            return result;
        }catch (CloneNotSupportedException cloneNotSupportedException){
            throw new AssertionError();
        }
    }
}
