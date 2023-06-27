package week12.xml;

import org.jdom2.Document;
import org.jdom2.Attribute;
import org.jdom2.Element;
import week12.LoginRequest;
import week12.LoginResponse;
import week12.Week12Exception;
import week12.Week12Object;

/**
 * Provides a set of utility methods to manage XML
 * 
 * @author Eric Willoughby
 * @date 8 April 2017
 */

public class XmlUtility {
	/**
	 * @param obj
	 *            - type Week12Object
	 * @return XML document
	 */
	public static Document objectToXml(Week12Object obj) throws Week12Exception {
		Document dom = null;
		if (obj instanceof LoginRequest) {
			dom = generateLoginRequestXml((LoginRequest) obj);
		} else if (obj instanceof LoginResponse) {
			dom = generateLoginResponseXml((LoginResponse) obj);
		} else {
			throw new Week12Exception("Unknown Week12 Object");
		}
		return dom;
	}

	/**
	 * @param dom
	 *            - type Document
	 * @return Object either LoginRequest/LoginResponse
	 */
	public static Week12Object xmlToObject(Document dom) throws Week12Exception {
		Week12Object atmObject = null;
		Element root = dom.getRootElement();
		String elementName = root.getName();
		try {
			if (elementName.equals("login-request")) {
				atmObject = getLoginObject(root);
			} else if (elementName.equals("login-response")) {
				atmObject = getLoginResponseObject(root);
			}
		} catch (NumberFormatException ex) {
			throw new Week12Exception(ex);
		}
		return atmObject;
	}

	/**
	 * @param response
	 *            - type LoginResponse
	 * @return LoginResponse XML
	 */
	private static Document generateLoginResponseXml(LoginResponse response) {
		Document dom = null;
		Element root = new Element("login-response");
		Attribute version = new Attribute("version", "1.0");
		root.setAttribute(version);
		String loggedInFmt = response.getLoggedIn().toString();
		Attribute loggedIn = new Attribute("logged-in", loggedInFmt);
		root.setAttribute(loggedIn);
		String sessionFmt = String.format("%d", response.getSessionId());
		Attribute account = new Attribute("session-id", sessionFmt);
		root.setAttribute(account);
		dom = new Document(root);
		return dom;
	}

	/**
	 * @param root
	 *            - type Element
	 * @return LoginResponse object
	 */
	private static Week12Object getLoginResponseObject(Element root) throws NumberFormatException {
		String loggedInString = root.getAttributeValue("logged-in");
		String sessionIdString = root.getAttributeValue("session-id");
		boolean loggedIn = Boolean.parseBoolean(loggedInString);
		int accountId = Integer.parseInt(sessionIdString);
		return new LoginResponse(loggedIn, accountId);
	}

	/**
	 * @param request
	 *            - type LoginRequest
	 * @return LoginRequest Xml
	 */
	private static Document generateLoginRequestXml(LoginRequest request) {
		Document dom = null;
		Element root = new Element("login-request");
		Attribute version = new Attribute("version", "1.0");
		root.setAttribute(version);
		String pinFmt = String.format("%d", request.getPin());
		Attribute pin = new Attribute("pin", pinFmt);
		root.setAttribute(pin);
		String accountFmt = String.format("%d", request.getAccountId());
		Attribute accountId = new Attribute("account-id", accountFmt);
		root.setAttribute(accountId);
		dom = new Document(root);
		return dom;
	}

	/**
	 * @param root
	 *            - type Element
	 * @return LoginRequest object
	 */
	private static Week12Object getLoginObject(Element root) throws NumberFormatException {
		String pinString = root.getAttributeValue("pin");
		String accountIdString = root.getAttributeValue("account-id");
		int pin = Integer.parseInt(pinString);
		int accountId = Integer.parseInt(accountIdString);
		return new LoginRequest(pin, accountId);
	}
}