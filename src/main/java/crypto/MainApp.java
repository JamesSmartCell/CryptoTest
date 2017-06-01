package crypto;

import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Created by James on 1/06/2017.
 */

// goal:
    // Create a command line app that does the following:
    // 1. accept a phrase which is converted into a public key and output it in base58 thus:
    // cryptotest -showkey -p "my dog smells like armpits"
    //
    // this will produce a signature and public key, say o4r5tte55vfFFgh ...
    //
    // 2. sign a document using the keypair:
    //
    // cryptotest -sign -p "my dog smells like armpits" -s importantDoc.pdf
    //
    // which will produce the signature, which can also be in base58, say 00ttcvujRTRTG4 ...
    //
    // 3. check the signature given a public key, thus:
    //
    // cryptotest -check -pk "o4r5tte55vfFFgh ..." -s importantDoc.pdf -sig "00ttcvujRTRTG4 ..."
    //
    // the output from the test should be true or false, depending on if the signature matches the key

public class MainApp
{
    public static void main(String[] args)
    {

    }
}
