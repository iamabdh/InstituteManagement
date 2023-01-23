package io.institute_management;

import java.util.Random;

public class Utils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	public String generateID() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            char c = (char)(rand.nextInt(26) + 'a');
            sb.append(c);
        }
        String randomString = sb.toString();
        return num + randomString;
    }

}
