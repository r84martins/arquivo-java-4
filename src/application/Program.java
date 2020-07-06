package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		//Lista todos os diretórios a partir de um caminho informado pelo usuário
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory); //listar somente diretório ou pasta
		
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		//Lista todos os arquivos a partir de um caminho informado pelo usuário
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		//Cria uma subpasta chamada dir
		boolean sucess = new File(strPath + "\\subdir").mkdir(); 
		System.out.println("Directory created successfully: " + sucess);
		
		sc.close();
	}
}
