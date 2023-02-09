package java github;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class commands {
    // init command
    public static void init() {
        // Create the .git2 folder
        File git2 = new File(".git2");
        git2.mkdir();
        // Create the staging area
        File staging = new File(".git2/staging");
        staging.mkdir();
        // Create the commits folder
        File commits = new File(".git2/commits");
        commits.mkdir();
        // Create the branches folder
        File branches = new File(".git2/branches");
        branches.mkdir();
        // Create the master branch
        File master = new File(".git2/branches/master");
        master.mkdir();
        // Create the head file
        File head = new File(".git2/HEAD");
    }
}
