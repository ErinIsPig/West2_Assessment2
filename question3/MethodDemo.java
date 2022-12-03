package Assessment2.question3;

import java.util.concurrent.locks.LockSupport;

public class MethodDemo {
    private static Thread t1 = null;
    private static Thread t2 = null;
    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9};
        int[] array2 = {2,4,6,8,10};
        printThread(array1,array2);
        System.out.println(checkEmail("1011110111@qq.com"));

    }
    public static void printThread(int[] array1,int[] array2){
        t1 = new Thread(() -> {
            for (int x : array1){
                System.out.print( x + " ");
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        });
        t2 = new Thread(() -> {
            for (int x : array2){
                LockSupport.park();
                System.out.print( x + " ");
                LockSupport.unpark(t1);
            }
        });
        t1.start();
        t2.start();
    }
    public static boolean checkEmail(String email){
        if(email != null && (!email.isEmpty())){
            return email.matches("^\\w+((-\\w+)|(\\.\\w+))*@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
        }
        return false;
    }
}

