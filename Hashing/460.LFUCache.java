class LFUCache {
    int capacity, currSize, minFreq;
    Map <Integer, DLLNode> cache;
    Map <Integer, DoublyLinkedList> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.currSize = 0;
        this.minFreq = 0;

        this.cache = new HashMap<>();
        this.freqMap = new HashMap<>();
    }
    
    public int get(int key) {
        DLLNode currNode = cache.get(key);
        if(currNode == null) return -1;

        updateNode(currNode);
        return currNode.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0) return;

        if(cache.containsKey(key)){
            DLLNode currNode = cache.get(key);
            currNode.val = value;
            updateNode(currNode);
        }else{
            currSize++;
            if(currSize > capacity){
                DoublyLinkedList minFreqList = freqMap.get(minFreq);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                currSize--;
            }
            minFreq = 1;
            DLLNode newNode = new DLLNode(key, value);
            DoublyLinkedList currList = freqMap.getOrDefault(1, new DoublyLinkedList());
            currList.addNode(newNode);
            freqMap.put(1, currList);
            cache.put(key, newNode);
        }
    }

    private void updateNode(DLLNode currNode){
        int currFreq = currNode.frequency;
        DoublyLinkedList currList = freqMap.get(currFreq);
        currList.removeNode(currNode);

        if(currFreq == minFreq && currList.listSize == 0){
            minFreq++;
        }

        currNode.frequency++;
        DoublyLinkedList newList = freqMap.getOrDefault(currNode.frequency, new DoublyLinkedList());
        newList.addNode(currNode);
        freqMap.put(currNode.frequency, newList);
    }

    class DLLNode{
        int key, val, frequency;
        DLLNode prev, next;

        DLLNode(int key, int val){
            this.key = key;
            this.val = val;
            this.frequency = 1;
        }
    }

    class DoublyLinkedList {
        int listSize;
        DLLNode head, tail;

        DoublyLinkedList(){
            this.listSize = 0;
            this.head = new DLLNode(0,0);
            this.tail = new DLLNode(0,0);
            head.next = tail;
            tail.prev = head;
        }

        public void addNode(DLLNode currNode){
            DLLNode nextNode = head.next;
            currNode.next = nextNode;
            currNode.prev = head;
            head.next = currNode;
            nextNode.prev = currNode;
            listSize++;
        }

        public void removeNode(DLLNode currNode){
            DLLNode prevNode = currNode.prev;
            DLLNode nextNode = currNode.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            listSize--;
        }
    }
}