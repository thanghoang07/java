package level_1;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.tempuri.StudentManagerWebService;
import org.tempuri.StudentManagerWebServiceSoap;
import org.tempuri.TruongHoc;

public class Test {
	//URL url1 = 
	StudentManagerWebService client;
	
	public static void main(String[] args) throws ServiceException, RemoteException, MalformedURLException {
		System.out.println("aaaa" + 1);
		new Test().view();
	}

	public void view() throws ServiceException, RemoteException, MalformedURLException {
		StudentManagerWebServiceSoap cl = client.getStudentManagerWebServiceSoap(new URL("http://round2demo4.azurewebsites.net/WServices/StudentManagerWebService.asmx"));
		//
		List<TruongHoc> listS = new ArrayList<TruongHoc>();
		TruongHoc[] th = cl.getListTruongHoc();
		for (TruongHoc truongHoc : th) {
			listS.add(truongHoc);
		}
		System.out.println(listS.size());
	}
}
