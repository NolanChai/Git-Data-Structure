// Simplified version of github in java
/**
 * Commands: init, add, commit, rm, log, global-log, find, status, checkout, branch, rm-branch, reset, merge
 */

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

// We want to use a tree structure to store the files

// java main
public class implementation {
    public static void main(String[] args) {
        // Check if the .gitignore folder exists
        if (!Files.exists(Paths.get(".gitlet"))) {
            // If not, create it
            File gitignore = new File(".gitlet");
            gitignore.mkdir();
        }
    }
}