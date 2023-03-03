public class UserTrail {

    int val1, val2;

    public UserTrail(int val1, int val2) {

        if(val1<0 || val2<0) throw new IllegalValueException();
        this.val1 = val1;
        this.val2 = val2;
    }

    public boolean show(){
        return val1 > 0 && val2 > 0;
    }



}
