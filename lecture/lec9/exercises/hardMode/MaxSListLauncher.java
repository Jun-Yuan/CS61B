/** 
 *  @author Josh Hug
 */

/* MaxSList launcher that you can experiment with. */
public class MaxSListLauncher { 
    public static void main(String[] args) {
        MaxSList msl = new MaxSList(0);
        msl.insertBack(50);
        SList sl = msl;
        msl.insertFront(1000);
        System.out.println(msl.max());
        //System.out.println(sl.max());
        MaxSList msl3 = (MaxSList) sl;

        /* Both cause compilation errors: */
        System.out.println(msl3.max());
        //MaxSList msl2 = sl;

        // causes compilation error
        //MaxSList msl4 = (SList) new MaxSList(5);
    }
} 