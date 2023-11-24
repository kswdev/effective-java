package effective.study.chapter03.Item13;

public class HashTable implements Cloneable {
    protected Entry[] buckets = new Entry[10];

    protected static class Entry {
        final Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        void add(Object key, Object value) {
            this.next = new Entry(key, value, null);
        }
        //이 엔트리가 가리키는 연결 리스트를 재귀적으로 복사
/*        Entry deepCopy() {
            return new Entry(key, value,
                    next == null ? null : next.deepCopy());
        }*/

        public Entry deepCopy() {
            Entry result = new Entry(key, value, next);
            for(Entry p = result; p.next != null; p = p.next) {
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            }
            return result;
        }
/*        protected Entry[] createNewBuckets() {
            throw  new AssertionError();
        }*/
    }

    //잘못된 clone 메서드 - 가변 상태 공유
    @Override public HashTable clone(){
        //TODO 배열을 clone하지 않으면 원본과 복사본이 동일한 배열을 참조하게 된다.
        HashTable result = null;
        try{
            result = (HashTable)super.clone();
            result.buckets = new Entry[this.buckets.length];
            for(int i=0;i<buckets.length;i++){
                result.buckets[i]=buckets[i].deepCopy();
            }
            return result;
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}


