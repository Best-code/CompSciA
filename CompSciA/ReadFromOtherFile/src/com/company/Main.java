package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
	File data = new File("C:\\Users\\Colin\\Desktop\\Code\\Code\\Java\\CompSciA\\ReadFromOtherFile\\src\\com\\company\\data.txt");
	Scanner reader = new Scanner(data);
	int[] dataValues = new int[100];
	int index = 0;
	while(reader.hasNext()){
		dataValues[index] = reader.nextInt();
		index++;
	}
	System.out.println(Arrays.toString(dataValues));

	File newData = new File("C:\\Users\\Colin\\Desktop\\Code\\Code\\Java\\CompSciA\\ReadFromOtherFile\\src\\com\\company\\data.txt");
	FileWriter writer = new FileWriter(newData);
	int[] randoms = new int[100];
	for(int i = 0; i < randoms.length; i++){
		randoms[i] = (int) (Math.random() * 100) + 1;
		writer.write(randoms[i] + "\r\n");
	}
	writer.close();
	System.out.println(Arrays.toString(randoms));
    }
}
