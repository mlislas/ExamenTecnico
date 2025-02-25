package com.mary.marvel.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MarvelApiUtils {
    public static String generateMD5(String input) throws NoSuchAlgorithmException {
    	
    	/**
        MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
			
		}
        byte[] hashInBytes = md.digest(input.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashInBytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString(); **/
    	
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashInBytes = md.digest(input.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashInBytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    	
    }
 }
