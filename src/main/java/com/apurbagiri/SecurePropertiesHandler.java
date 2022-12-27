package com.apurbagiri;

import java.io.IOException;

import org.mule.encryption.exception.MuleEncryptionException;

import com.mulesoft.tools.SecurePropertiesTool;

/**
 * Handler class for encrypting or decrypting strings & files using MuleSoft
 * provided secure-properties-tool.jar
 * 
 * @author apurb
 *
 */
public class SecurePropertiesHandler {

	/**
	 * Method to encrypt or decrypt a text string
	 * 
	 * @param operation
	 * @param algorithm
	 * @param mode
	 * @param key
	 * @param value
	 * @return String
	 */
	public static String processString(String operation, String algorithm, String mode, String key, String value) {
		StringBuilder output = new StringBuilder();
		try {
			output.append(SecurePropertiesTool.applyOverString(operation, algorithm, mode, key, false, value));
		} catch (MuleEncryptionException e) {
			output.append("##ERROR#: ").append("Error Ocurred while attempting to ").append(operation).append(". ").append(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			output.append("##ERROR#: ").append("Error Ocurred while attempting to ").append(operation).append(". ").append(e.getMessage());
			e.printStackTrace();
		}
		return output.toString();
	}

	/**
	 * Method to encrypt or decrypt all values inside a properties file
	 * 
	 * @param operation
	 * @param algorithm
	 * @param mode
	 * @param key
	 * @param inputFilePath
	 * @param outputFileName
	 * @return String
	 */
	public static String processFileProperties(String operation, String algorithm, String mode, String key,
			String inputFilePath, String outputFileName) {
		StringBuilder output = new StringBuilder();
		try {
			SecurePropertiesTool.applyOverFile(operation, algorithm, mode, key, false, inputFilePath, outputFileName);
		} catch (IOException e) {
			output.append("##ERROR#: ").append("Error Ocurred while attempting to ").append(operation).append(". ").append(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			output.append("##ERROR#: ").append("Error Ocurred while attempting to ").append(operation).append(". ").append(e.getMessage());
			e.printStackTrace();
		}
		return output.toString();
	}

	/**
	 * Method to encrypt or decrypt all the content of a properties file.
	 * 
	 * @param operation
	 * @param algorithm
	 * @param mode
	 * @param key
	 * @param inputFilePath
	 * @param outputFileName
	 * @return String
	 */
	public static String processFile(String operation, String algorithm, String mode, String key, String inputFilePath,
			String outputFileName) {
		StringBuilder output = new StringBuilder();
		try {
			SecurePropertiesTool.applyHoleFile(operation, algorithm, mode, key, false, inputFilePath, outputFileName);
		} catch (IOException | MuleEncryptionException e) {
			output.append("##ERROR#: ").append("Error Ocurred while attempting to ").append(operation).append(". ").append(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			output.append("##ERROR#: ").append("Error Ocurred while attempting to ").append(operation).append(". ").append(e.getMessage());
			e.printStackTrace();
		}
		return output.toString();
	}
	
}
