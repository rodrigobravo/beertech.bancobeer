package com.beertech.banco;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

public class BancoUtils {

    public static String gerarHash(Integer id) {
        try {

            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            byte messageDigest[] = algorithm.digest(new byte[]{id.byteValue()});

            return messageDigest.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }


    }
}
