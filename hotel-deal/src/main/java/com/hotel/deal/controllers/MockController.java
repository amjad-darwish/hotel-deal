/**
 * 
 */
package com.hotel.deal.controllers;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amjad_darwish
 *
 */
@RestController
public class MockController {

	@RequestMapping("/mock")
	public String fetch() throws FileNotFoundException {
		Scanner scanner = new Scanner(Thread.currentThread().getContextClassLoader().getResourceAsStream("response.txt"));
		
		String res = "";
		
		while (scanner.hasNext()) {
			res += scanner.next();
		}
	
		scanner.close();
		
		return res;
	}
}
