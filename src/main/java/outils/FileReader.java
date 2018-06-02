/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outils;


public class FileReader {

	FileStr fileStr = new FileStr();

	private static final String FICHIER_PAYS = "Pays.txt";

	public String[] readPays() {return fileStr.read(FICHIER_PAYS);}	

}