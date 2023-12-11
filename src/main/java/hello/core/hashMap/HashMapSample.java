package hello.core.hashMap;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        new WriterThread(map, "Writer-1", 1).start();
        new WriterThread(map, "Writer-2", 2).start();

        for (int i = 1; i <= 5; i++) {
            new ReaderThread(map, "Reader-" + i).start();
        }
    }
}
