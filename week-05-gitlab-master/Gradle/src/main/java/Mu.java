/**
 * The ASP Virtual Machine (AVM) has a Memory Unit that stores Variable objects.
 * To this end implement the Memory Unit class. Objects of this class must be
 * able to store up to 10 Variable objects. You must use an array (not a list)
 * to store these objects.
 * 
 * @author Elijah Weske
 * @version N/A
 */

public class Mu {

    /**
     * Memory Unit that stores Variable objects. Objects of this class must be
     * able to store up to 10 Variable objects. The objects must be stored in an
     * array, not a list.
     */
    private int        capacity = 10;
    private Variable[] memory;


    /**
     * constructor, it initializes the array of variables. - memory to all
     * empty.
     */
    public Mu() {
        memory = new Variable[10];
    }


    /**
     * getter method it returns the number of variables that can be stored in
     * the memory.
     * 
     * @return capacity - storage space
     */
    public int capacity() {
        return capacity;
    }


    /**
     * getter method it returns the variable object stored at a given address.
     * if null or no variable, then returns null.
     * 
     * @param adr - an Integer address
     *            
     * @return Variable at the given address.
     */
    public Variable fetch(Integer adr) {
        if (adr < 10 && adr >= 0) {
            return memory[adr];
        }
        else {
            return null;
        }
    }


    /**
     * setter method stores a variable at a given address. it replaces the
     * variable if one exists.
     * 
     * @param v - a Variable object to be stored at the given address.
     * @param adr - given Integer address.       
     * @return Boolean - true if storage is successful, false otherwise.
     */
    public Boolean store(Variable v, Integer adr) {
        if (adr < 10 && adr >= 0) {
            memory[adr] = v;
        }
        else {
            return false;
        }

        if (memory[adr] == v) {
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * getter method it returns the number of memory spaces occupied.
     * 
     * @return int, # of memory spaces occupied.
     */
    public int used() {
        int used = 0;

        for (int i = 0; i < 10; i++) {
            if (memory[i] != null) {
                used++;
            }
        }
        return used;
    }
}
