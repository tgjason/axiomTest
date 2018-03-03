package cmo.demo.axiom;


import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;

public class App {
	public static void main(String[] args) throws AxisFault {
		EndpointReference targetEPR = new EndpointReference("http://220.180.238.129:6666/WebService_hf/JKXWwebservice/WebServiceJkxw.asmx");
		Options options = new Options();
		options.setManageSession(true);   
		options.setTo(targetEPR);
		options.setProperty(HTTPConstants.CHUNKED, "false");// 设置不受限制.
		options.setAction("http://tempuri.org/Jkxw_GetTjxx");// 调用接口方法
		ServiceClient sender = new ServiceClient();
		sender.setOptions(options);
		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace("http://tempuri.org/", "");
		OMElement method = fac.createOMElement("Jkxw_GetTjxx", omNs);
		OMElement name = fac.createOMElement("sData", omNs);// 设置入参名称
//		name.setText("<XML><KSRQ>2017-07-03 00:00:58</KSRQ><JSRQ>2017-07-03 23:59:59</JSRQ><JGBM></JGBM></XML>");// 设置入参值
//		name.setText("<XML><KSRQ>2017-07-06 12:03:58</KSRQ><JSRQ>2017-07-10 23:59:59</JSRQ><JGBM></JGBM></XML>");// 设置入参值
//		name.setText("<XML><KSRQ>2017-07-11 00:00:01</KSRQ><JSRQ>2017-07-11 08:50:44</JSRQ><JGBM></JGBM></XML>");// 设置入参值
//		name.setText("<XML><KSRQ>2017-07-11 08:50:44</KSRQ><JSRQ>2017-07-11 09:50:44</JSRQ><JGBM></JGBM></XML>");// 设置入参值
		name.setText("<XML><KSRQ>2017-07-19 08:50:44</KSRQ><JSRQ>2017-07-19 23:59:59</JSRQ><JGBM></JGBM></XML>");// 设置入参值
		method.addChild(name);
		method.build();
		OMElement response = sender.sendReceive(method);
		OMElement elementReturn = response.getFirstElement();
		System.out.println("result:" + elementReturn.getText());
		sender.cleanupTransport();
	}
}