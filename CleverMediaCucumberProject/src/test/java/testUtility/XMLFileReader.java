package testUtility;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XMLFileReader {

	public static void main(String[] args) {
		try{
			String filePath = "C:\\Users\\blogg\\Desktop\\input.xml";
			File file = new File(filePath);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbf.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println(doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("account");
			int tLength = nodeList.getLength();
			
		
		for(int i=0; i<tLength; i++){
				Node node = nodeList.item(i);
				
				if(node.getNodeType()==Node.ELEMENT_NODE){
					Element element = (Element)node;
					System.out.println("Account No: "+element.getAttribute("acn"));
					System.out.println("First Name: "+element.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name: "+element.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Balance: "+element.getElementsByTagName("balance").item(0).getTextContent());
				}
				
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	
	}

}