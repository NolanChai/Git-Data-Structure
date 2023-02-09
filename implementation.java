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
        // Check if the .gitlet folder exists
        if (Files.exists(Paths.get(".git2"))) {
            // If it does, check if the command is valid
            if (args[0].equals("init")) {
                System.out.println("A git2 version control system already exists in the current directory.");
            } else {
                // If it is, run the command
                runCommand(args);
            }
        } else {
            // If it doesn't, check if the command is valid
            if (args[0].equals("init")) {
                // If it is, run the init from commands
                commands.init();
            } else {
                System.out.println("Not in an initialized git2 directory.");
            }
        }
    }
}