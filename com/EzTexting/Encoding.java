package com.EzTexting;

import java.util.List;

/**
 */
public abstract class Encoding {
    public static final Encoding JSON = new JSONEncoding();
    public static final Encoding XML = new XMLEncoding();

    abstract String getEncodingParam();

    abstract String parseErrors(String encodedString) throws Exception;

    abstract BaseObject parseObjectResponse(Class<BaseObject> aClass, String encodedString) throws Exception;;

    abstract List<BaseObject> parseObjectsResponse(Class<BaseObject> aClass, String encodedString) throws Exception;;
}
