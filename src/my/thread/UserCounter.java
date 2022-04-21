package my.thread;

public class UserCounter extends Thread {
private int userCount = 0;
    @Override
    public void run() {
        Counter.getCounter().incrementCount();
        }


    public static void main(String[] args) {
        int i =0;


        try {
            while (i < 100) {
                UserCounter userCounter = new UserCounter();
                userCounter.setName("userCounterThread" + i++);
                userCounter.start();


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        }

    class Counter {
        private int userCount = 0;

        public void incrementCount() {
            userCount++;
        }

        public int getUserCount;
        private static Counter counter;
        public static Counter getCounter() {
            if(counter ==null) {
                counter = new Counter();
            }
            return counter;
        }
    }