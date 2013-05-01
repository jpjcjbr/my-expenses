package br.com.jp.utils;

import javax.faces.context.FacesContext;

public class JSFFlash {

	public static void put(String key, Object value)
	{
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put(key, value);
	}
}
