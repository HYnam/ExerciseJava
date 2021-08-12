package Week2;

public class OppositeDirection
{
    /**
     * Determines and returns the opposite direction.
     * Returns "up" if direction is "down", "down" if direction is "up",
     * "right" if direction is "left", "left" if direction is "right", "none" if
     * direction is anything else.
     * Return value is case sensitive.
     *
     * @param direction The direction to be evaluated.
     * @return String containing the opposite direction from the provided direction.
     */
    public String oppositeDirection(String direction) {
        // write your code here
        String result;
        if (direction == "up"){
            result = "down";
        } else if (direction == "down"){
            result = "up";
        } else if (direction == "right"){
            result = "left";
        } else if (direction == "left"){
            result = "right";
        } else{
            result = "none";
        }
        return result;
    }
}
