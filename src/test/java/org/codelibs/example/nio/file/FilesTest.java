package org.codelibs.example.nio.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.codelibs.example.util.function.ToXFunctionTest;

public class FilesTest extends TestCase {

    public FilesTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ToXFunctionTest.class);
    }

    public void testApplyAsInt() throws IOException {
        final Path src = Paths.get("hoge.txt");
        final Path dst = Paths.get("fuga.txt");

        Files.copy(src, dst, StandardCopyOption.COPY_ATTRIBUTES);

        FileSystems.newFileSystem(src, ClassLoader.getSystemClassLoader());

    }
}