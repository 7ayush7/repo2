package Set1;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

//To decypher Jboss encrypted password
public class DecodePassword{

	 

    public static void main(String[] args)

    {

      String value = null;

      if (args.length < 0) {

        System.out.println("Necessary arguments Not passed,Please Pass the Password To Decrypt");

      } else {

        value = args[0].toString().trim();

      }

      try

      {

        System.out.println(decode(value));

      }

      catch (Exception io)

      {

        io.printStackTrace();

      }

    }

 

public static char[] decode(String secret)

      throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException

    {

      byte[] kbytes = "jaas is the way".getBytes();

      SecretKeySpec key = new SecretKeySpec(kbytes, "Blowfish");

     

      BigInteger n = new BigInteger(secret, 16);

      byte[] encoding = n.toByteArray();

     

      Cipher cipher = Cipher.getInstance("Blowfish");

      cipher.init(2, key);

      byte[] decode = cipher.doFinal(encoding);

      return new String(decode).toCharArray();

    }



}