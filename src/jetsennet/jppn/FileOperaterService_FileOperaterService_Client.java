
package jetsennet.jppn;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2014-04-22T12:53:12.976+08:00
 * Generated source version: 2.7.4
 * 
 */
public final class FileOperaterService_FileOperaterService_Client {

    private static final QName SERVICE_NAME = new QName("http://JetsenNet/JPPN/", "FileOperaterService");

    private FileOperaterService_FileOperaterService_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = FileOperaterService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        FileOperaterService_Service ss = new FileOperaterService_Service(wsdlURL, SERVICE_NAME);
        FileOperaterService port = ss.getFileOperaterService();  
        
        {
        System.out.println("Invoking fileOperation...");
        java.lang.String _fileOperation_objXml = "";
        jetsennet.jppn.bean.JppnResult _fileOperation__return = port.fileOperation(_fileOperation_objXml);
        System.out.println("fileOperation.result=" + _fileOperation__return);


        }

        System.exit(0);
    }

}