package pp7.pkg8;

class LockableClass implements Lockable
{
    private int key;
    private boolean isLocked;

    public void setKey(int key) {
        this.key = key;
    }

    public void lock(int key) {
        if(this.key == key)
            isLocked=true;
        else
            System.out.println("Invalid Key to lock");
    }
    public void unlock(int key) {
        if(this.key==key)
            isLocked=false;
        else
            System.out.println("Invalid key to unlock");
    }
    public boolean locked() {
        return isLocked;
    }
}

public class Pp78 {
    public static void main(String[] args) {
        LockableClass lockableClass=new LockableClass();
        // set key to 100
        lockableClass.setKey(100);
        System.out.println("Is Locked? "+lockableClass.locked());

        // try to lock with 200, wrong
        lockableClass.lock(200);
        //now lock with 100. Correct
        lockableClass.lock(100);
        System.out.println("Is Locked? "+lockableClass.locked());

        // unlock with 200, wrong
        lockableClass.unlock(200);
        // unlock with 100, Correct
        lockableClass.unlock(100);

        System.out.println("Is Locked? "+lockableClass.locked());
    }
}
