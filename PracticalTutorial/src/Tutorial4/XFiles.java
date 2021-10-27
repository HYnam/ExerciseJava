package Tutorial4;

import java.util.LinkedList;
import java.util.List;

/** Task 1.1 */
public class XFiles {
    public LinkedList<String> files; // Can change in other class

    public void add(String newFile) {
        // newFile.length()!= 0 and !newFile.isEmpty() both check the string not empty
        if (newFile != null && newFile.length() != 0
            && newFile.charAt(0) == 'X') {
            files.add(newFile);
        }
    }

    public void remove(String file) {
        files.remove(file);
    }

    public List<String> getFiles() {
        return files;
    }
}