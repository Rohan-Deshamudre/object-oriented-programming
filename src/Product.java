
/**
 * An abstact class for Apple Products
 * 
 * @author ricar
 *
 */
public abstract class Product {
	protected String name;
	protected int price;
	protected String color;

	/**
	 * Constructor for the class Product
	 */
	public Product(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		if (color == null) {
			if (other.color != null) {
				return false;
			}
		} else if (!color.equals(other.color)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (price != other.price) {
			return false;
		}
		return true;
	}

	/**
	 * Reads in a line, for example from a file
	 * 
	 * @param line line to read
	 * @return a Product
	 */
	public static Product read(String line) {
		if (line.contains("IPHONE")) {
			return IPhone.read(line);
		} else if (line.contains("IPAD")) {
			return IPad.read(line);
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Returns a String formatted to fit the style of the file
	 * 
	 * @return Returns a String formatted to fit the style of the file
	 * 
	 */
	public abstract String fileFormated();
	
	@Override
	public abstract String toString();

}
