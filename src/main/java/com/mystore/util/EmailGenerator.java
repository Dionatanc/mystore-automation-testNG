package com.mystore.util;

import java.util.Random;
//Classe copiada do Stackoverflow (https://stackoverflow.com/questions/45841500/generate-random-emails) pois estava tendo que gerar manualmente emails toda vez que executava a automacao
public class EmailGenerator {
	
	public String getSaltString() {
    String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 10) { // length of the random string.
        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
        salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr;

		}
	
	
}