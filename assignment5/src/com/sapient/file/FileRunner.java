package com.sapient.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRunner {

	public static void main(String[] args) throws IOException {
		
		String directoryName = read.rd.nextLine();
		Path currentDirectory = Paths.get("." + directoryName );
		Files.list(currentDirectory).forEach(System.out::println);

	}

}
