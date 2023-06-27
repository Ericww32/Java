/**
 * @author Eric Willoughby
 * 
 * @param Telephone(String)
 *            constructor to break apart number
 * 
 * @param setAreaCode()
 *            Sets areaCode
 * @param setExhcange()
 *            Sets exchange
 * @param setLocalNumber()
 *            Sets localNumber
 *
 * @return getAreaCode() returns areaCode
 * @return getExchange() returns exchange
 * @return getLocalNumber() returns localNumber
 * @return toString() sends a message to console
 */

public class Telephone {

	private String areaCode;
	private String exchange;
	private String localNumber;

	public Telephone(String stringy) {
		char[] splitNumber = stringy.toCharArray();
		String splitAreaCode;
		String splitExchange;
		String splitLocalNumber;

		if (splitNumber.length <= 11) {
			splitAreaCode = new String(splitNumber, 0, 3);
			setAreaCode(splitAreaCode);

			splitExchange = new String(splitNumber, 3, 3);
			setExchange(splitExchange);

			splitLocalNumber = new String(splitNumber, 6, 4);
			setLocalNumber(splitLocalNumber);
		}
		else{
			System.out.println("too many numbers! ");
		}

	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}

	@Override
	public String toString() {
		return "Telephone: " + " (" + areaCode + ") " + exchange + "-" + localNumber;
	}

}