package hello.core.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ReaderThread extends Thread {
    private HashMap<Integer, String> map;
    private String name;

    public ReaderThread(HashMap<Integer, String> map, String threadName) {
        this.map = map;
        this.name = threadName;
    }

    public void run() {
        while (true) {

            HashMap<Integer, String> keySetView = map;
            Iterator<Integer> iterator = map.keySet().iterator();

            long time = System.currentTimeMillis();
            String output = time + ": " + name + ": ";

            while (iterator.hasNext()) {
                Integer key = iterator.next();
                String value = map.get(key);
                output += key + "=>" + value + "; ";
            }

            System.out.println(output);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
