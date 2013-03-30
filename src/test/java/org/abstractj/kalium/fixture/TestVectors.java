package org.abstractj.kalium.fixture;

public class TestVectors {

    /**
     * SHA256 test vectors
     */

    public static final String SHA256_MESSAGE = "My Bonnie lies over the ocean, my Bonnie lies over the sea";
    public static final String SHA256_DIGEST = "d281d10296b7bde20df3f3f4a6d1bdb513f4aa4ccb0048c7b2f7f5786b4bcb77";
    public static final String SHA256_DIGEST_EMPTY_STRING = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";

    /**
     * SHA512 test vectors
     */
    public static final String SHA512_MESSAGE = "My Bonnie lies over the ocean, Oh bring back my Bonnie to me";
    public static final String SHA512_DIGEST = "2823e0373001b5f3aa6db57d07bc588324917fc221dd27975613942d7f2e19bf4" +
            "44654c8b9f4f9cb908ef15f2304522e60e9ced3fdec66e34bc2afb52be6ad1c";
    public static final String SHA512_DIGEST_EMPTY_STRING = "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921" +
            "d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e";


    /**
     * Curve25519 test vectors
     */

    public static final String BOB_PRIVATE_KEY = "5dab087e624a8a4b79e17f8b83800ee66f3bb1292618b6fd1c2f8b27ff88e0eb";
    public static final String BOB_PUBLIC_KEY = "de9edb7d7b7dc1b4d35b61c2ece435373f8343c85b78674dadfc7e146f882b4f";

    public static final String ALICE_PRIVATE_KEY = "77076d0a7318a57d3c16c17251b26645df4c2f87ebc0992ab177fba51db92c2a";
    public static final String ALICE_PUBLIC_KEY = "8520f0098930a754748b7ddcb43ef75a0dbf3a0d26381af4eba4a98eaa9b4e6a";
    public static final String ALICE_MULT_BOB = "4a5d9d5ba4ce2de1728e3bf480350f25e07e21c947d19e3376f09b3c1e161742";

    public static final String BOX_NONCE = "69696ee955b62b73cd62bda875fc73d68219e0036b7a0b37";
    public static final String BOX_MESSAGE = "be075fc53c81f2d5cf141316ebeb0c7b5228c52a4c62cbd44b66849b64244ffc" +
            "e5ecbaaf33bd751a1ac728d45e6c61296cdc3c01233561f41db66cce314adb31" +
            "0e3be8250c46f06dceea3a7fa1348057e2f6556ad6b1318a024a838f21af1fde" +
            "048977eb48f59ffd4924ca1c60902e52f0a089bc76897040e082f93776384864" +
            "5e0705";
    public static final String BOX_CIPHERTEXT = "f3ffc7703f9400e52a7dfb4b3d3305d98e993b9f48681273c29650ba32fc76ce" +
            "48332ea7164d96a4476fb8c531a1186ac0dfc17c98dce87b4da7f011ec48c972" +
            "71d2c20f9b928fe2270d6fb863d51738b48eeee314a7cc8ab932164548e526ae" +
            "90224368517acfeabd6bb3732bc0e9da99832b61ca01b6de56244a9e88d5f9b3" +
            "7973f622a43d14a6599b1f654cb45a74e355a5";
}
