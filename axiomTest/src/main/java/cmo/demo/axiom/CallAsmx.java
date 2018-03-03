package cmo.demo.axiom;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class CallAsmx {
	public static void main(String[] args) throws Exception {
		String inputParam = "<XML><KSRQ>2017-07-06 12:03:58</KSRQ><JSRQ>2017-07-10 23:59:59</JSRQ><JGBM></JGBM></XML>";
//		inputParam = "<XML><KSRQ>2017-07-19 00:00:01</KSRQ><JSRQ>2017-07-19 23:59:59</JSRQ><JGBM></JGBM></XML>";
		Service service = new Service();
		String url = "http://220.180.238.129:6666/WebService_hf/JKXWwebservice/WebServiceJkxw.asmx"; // URL地址
		String namespace = "http://tempuri.org/";
		String actionUri = "Jkxw_GetTjxx"; // Action路径
		String op = "Jkxw_GetTjxx"; // 要调用的方法名
		Call call = (Call) service.createCall();
		call.setTargetEndpointAddress(new java.net.URL(url));
		call.setUseSOAPAction(true);
		call.setSOAPActionURI(namespace + actionUri); // action uri
		call.setOperationName(new QName(namespace, op));// 设置要调用哪个方法
		// 设置参数名称，具体参照从浏览器中看到的
		call.addParameter(new QName(namespace, "sData"), XMLType.XSD_STRING, ParameterMode.IN); // 设置请求参数及类型
		// call.setReturnType(new QName(namespace,"getinfo"),Model.class); //设置返回结果为是某个类
		call.setReturnType(XMLType.XSD_STRING);// 设置结果返回类型
		Object[] params = new Object[] { inputParam };
		String result = (String) call.invoke(params); // 方法执行后的返回值
		System.out.println(result);
	}
}