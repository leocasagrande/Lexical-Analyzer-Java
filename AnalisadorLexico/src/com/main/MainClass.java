package com.main;

import com.exception.IsiLexicalException;
import com.lexico.*;

public class MainClass {

	public static void main(String[] args) {
		try {
		IsiScanner sc = new IsiScanner("input.isi");
		Token token = null;
			do {
				token = sc.nextToken();
				if(token != null) {
				System.out.println(token);
				}
			}while(token != null);
		}catch(IsiLexicalException e) {
			System.out.println("Lexical ERROR " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Generic ERROR!!");
		}
	}
	
}
