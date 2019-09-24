package uk.co.cflabs.encryption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.Charset;
import java.security.*;
import java.security.spec.ECGenParameterSpec;
import java.util.Optional;

@Service
public class EncryptionService
{

	@Autowired
	AESService encryptionService;
	@Autowired
	Sha512Service shaService;
	private static final Logger logger = LoggerFactory.getLogger("EncryptionService");

	public EncryptionService() throws Exception
	{

	}

	@PostConstruct
	public void testMethod() throws Exception
	{
		var testMessage = "test_message";
		Optional<EncryptedResponse> response =  encryptionService.encrypt(testMessage);
		if(response.isPresent())
		{
			EncryptedResponse finalResponse = response.get();
			Optional<String> x = encryptionService.decrypt(response.get());
			logger.info("Signing Public Key:[{}]", DatatypeConverter.printHexBinary(finalResponse.getSigningKeyPair().getPublic().getEncoded()));
			logger.info("Signing Private Key:[{}]", DatatypeConverter.printHexBinary(finalResponse.getSigningKeyPair().getPrivate().getEncoded()));
			logger.info("Encrypting Private Key:[{}]", DatatypeConverter.printHexBinary(finalResponse.getPrivateKey().getEncoded()));
			logger.info("Encrypted Test:[{}]",finalResponse.getEncryptedText());
			logger.info("Signature: [{}]", finalResponse.getSignature());
			logger.info("Sha512Sum: [{}]", finalResponse.getShaSum());
			logger.info("Text decrypted: [{}]", x.get());
		}

	}

}
