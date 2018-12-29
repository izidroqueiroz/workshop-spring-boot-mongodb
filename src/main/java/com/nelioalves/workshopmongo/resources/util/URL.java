package com.nelioalves.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {
	
//	private static final Logger LOG = LoggerFactory.getLogger(URL.class);
	
	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
//			LOG.info("Erro URL");
//			LOG.info(text);
			return "";
		}
	}

}
