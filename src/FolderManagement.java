import java.io.File;

public class FolderManagement {
    public static String[] getSubFolders (String dir) {
        File file = new File(dir);
        String[] directories = file.list((current, name) -> new File(current, name).isDirectory());
        if (directories != null) {
            for (int i = 0; i<directories.length; i++) {
                directories[i] = dir + "/" + directories[i];
            }
        }
        return directories;
    }

    public static String getFolderName(String dir) {
        String[] nodes = dir.split("/");
        return nodes[nodes.length - 1];
    }
}
