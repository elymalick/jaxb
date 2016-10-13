package modele;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class application {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub

		Customer c=new Customer();
		c.setId(1);
		c.setAge(10);
		c.setName("test");
		
		JAXBContext context= JAXBContext.newInstance(Customer.class);
		
		Marshaller marshal= context.createMarshaller();
		
		marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshal.marshal(c, System.out);
	}

}
