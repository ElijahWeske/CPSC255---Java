/**
 * A variable is an object holding a string identifier and an integer data
 * value. This class creates Variables.
 * 
 * @author Elijah Weske
 * @version N/A
 */
public class Variable {

    /**
     * private fields; identifier and data.
     */
    private String  identifier;
    private Integer variableData;


    /**
     * Constructor; it initializes the fields with the given values.
     * 
     * @param id - String identifier
     * @param data - Integer data 
     */
    public Variable(String id, Integer data) {
        identifier = id;
        variableData = data;
    }


    /**
     * getter method; it returns the variable's identifier.
     * 
     * @return variable's identifier.
     */
    public String getIdentifier() {
        return identifier;
    }


    /**
     * setter method; it initializes the variables idenitifer.
     * 
     * @param id - variable's identifier      
     */
    public void setIdentifier(String id) {
        identifier = id;
    }


    /**
     * setter method; it initializes the variable's data.
     * 
     * @param data - object's data as an Integer.
     */
    public void setData(Integer data) {
        variableData = data;
    }


    /**
     * getter method; it returns the variable's data.
     * 
     * @return variable's data - variableData.
     */
    public Integer getData() {
        return variableData;
    }


    /**
     * getter method; it returns the string representation of the variable. The
     * string is formatted [id, data].
     * 
     * @return string representation of variable object.
     */
    public String toString() {
        return "[" + identifier + "," + variableData + ")";
    }
}
