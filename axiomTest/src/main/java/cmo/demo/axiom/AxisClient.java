package cmo.demo.axiom;

import org.tempuri.*;

public class AxisClient {
	public static void main(String[] args) throws Exception {
		WebServiceJkxwSoap jkxw = new WebServiceJkxwLocator().getWebServiceJkxwSoap();
		String result = jkxw.jkxw_GetTjxx("<XML><KSRQ>2017-07-06 12:03:58</KSRQ><JSRQ>2017-07-10 23:59:59</JSRQ><JGBM></JGBM></XML>");
		System.out.println(result);
	}
}