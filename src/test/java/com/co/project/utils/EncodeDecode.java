package com.co.project.utils;

import org.apache.commons.codec.binary.Base64;

public class EncodeDecode {

	// Encode
	private static String encoded64BitString;

	public static String encode(String decryptedString) throws Exception {
		byte[] encodedBytes = Base64.encodeBase64(decryptedString.getBytes());
		encoded64BitString = new String(encodedBytes);

		return encoded64BitString;
	}

	// Decode
	private static String decoded64BitString;

	public static String decode(String encryptedString) throws Exception {
		byte[] decodedBytes = Base64.decodeBase64(encryptedString.getBytes());
		decoded64BitString = new String(decodedBytes);

		return decoded64BitString;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(EncodeDecode.encode("testpass#6"));
		System.out.println(EncodeDecode.decode("dGVzdHBhc3MjMQ=="));
	}

}
