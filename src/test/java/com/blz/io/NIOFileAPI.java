package com.blz.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class NIOFileAPI {
    @Test
    public void givenPathWhenCheckedSomeIoOperationsItShouldReturnCorrectFile() throws IOException {
        String folderPath = "C:\\Users\\SONY\\JAVA\\EmployeePayroll\\src\\main\\resources";
        Path directory = Paths.get(folderPath + "\\Demo");
        Files.createDirectories(directory);
        //     Files.createDirectory(directory);
        Assert.assertTrue(Files.exists(directory));
        IntStream.range(1, 11).forEach(value -> {
            Path filePath = Paths.get(folderPath + "\\Demo\\temp" + value + ".txt");
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // list all the files
        Files.list(directory).forEach(System.out::println);
        Files.list(directory).filter(file -> Files.isRegularFile(file))
                .forEach(System.out::println);
        System.out.println();
        // list all directories
        Files.list(directory).filter(file -> Files.isDirectory(file))
                .forEach(System.out::println);

        Files.newDirectoryStream(directory).forEach(System.out::println);
        Files.newDirectoryStream(directory,
                        path -> path.toFile().isFile()
                                && path.getFileName().toString().startsWith("abc"))
                .forEach(System.out::println);

        directory.toFile().delete();
        deleteFiles(directory.toFile());
    }

    private boolean deleteFiles(File files) {
        File[] listFiles = files.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                deleteFiles(file);
            }
        }
        return files.delete();
    }
}
