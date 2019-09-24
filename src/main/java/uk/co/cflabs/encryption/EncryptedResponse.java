package uk.co.cflabs.encryption;

import javax.crypto.SecretKey;
import java.security.KeyPair;

public class EncryptedResponse
{
	byte [] IV;
	SecretKey privateKey;
	String encryptedText;
	String signature;
	KeyPair signingKeyPair;

	public String getShaSum()
	{
		return shaSum;
	}

	public void setShaSum(String shaSum)
	{
		this.shaSum = shaSum;
	}

	private String shaSum;

	public EncryptedResponse()
	{

	}

	public EncryptedResponse(byte[] IV, SecretKey privateKey, String encryptedText, String signature, KeyPair signingKeyPair)
	{
		this.IV = IV;
		this.privateKey = privateKey;
		this.encryptedText = encryptedText;
		this.signature = signature;
		this.signingKeyPair = signingKeyPair;
	}

	public byte[] getIV()
	{
		return IV;
	}

	public void setIV(byte[] IV)
	{
		this.IV = IV;
	}

	public SecretKey getPrivateKey()
	{
		return privateKey;
	}

	public void setPrivateKey(SecretKey privateKey)
	{
		this.privateKey = privateKey;
	}

	public String getEncryptedText()
	{
		return encryptedText;
	}

	public void setEncryptedText(String encryptedText)
	{
		this.encryptedText = encryptedText;
	}

	public String getSignature()
	{
		return signature;
	}

	public void setSignature(String signature)
	{
		this.signature = signature;
	}

	public KeyPair getSigningKeyPair()
	{
		return signingKeyPair;
	}

	public void setSigningKeyPair(KeyPair signingKeyPair)
	{
		this.signingKeyPair = signingKeyPair;
	}
}
