/**
 * Concrete class for iPads
 * 
 * @author ricar
 *
 */
public class IPad extends Product {
	private double screensize;
	private String processor;
	private boolean has4G;
	private String memory;

	/**
	 * Constructor for class IPad
	 * 
	 * @param name
	 * @param price
	 * @param color
	 * @param screensize
	 * @param processor
	 * @param has4g
	 * @param memory
	 * @param has3dTouch
	 */
	public IPad(String name, int price, String color, double screensize, String processor, boolean has4G,
			String memory) {
		super(name, price, color);
		this.screensize = screensize;
		this.processor = processor;
		this.has4G = has4G;
		this.memory = memory;
	}

	/**
	 * @return the screensize
	 */
	public double getScreensize() {
		return screensize;
	}

	/**
	 * @param screensize the screensize to set
	 */
	public void setScreensize(double screensize) {
		this.screensize = screensize;
	}

	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	/**
	 * @return the has4G
	 */
	public boolean isHas4G() {
		return has4G;
	}

	/**
	 * @param has4g the has4G to set
	 */
	public void setHas4G(boolean has4g) {
		has4G = has4g;
	}

	/**
	 * @return the memory
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(String memory) {
		this.memory = memory;
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
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof IPad)) {
			return false;
		}
		IPad other = (IPad) obj;
		if (has4G != other.has4G) {
			return false;
		}
		if (memory == null) {
			if (other.memory != null) {
				return false;
			}
		} else if (!memory.equals(other.memory)) {
			return false;
		}
		if (processor == null) {
			if (other.processor != null) {
				return false;
			}
		} else if (!processor.equals(other.processor)) {
			return false;
		}
		if (Double.doubleToLongBits(screensize) != Double.doubleToLongBits(other.screensize)) {
			return false;
		}
		return true;
	}

	/**
	 * Reads in a line, for example from a text file, and returns an iPad
	 * 
	 * @param line line to read from
	 * @return an iPad
	 */
	public static IPad read(String line) {
		String[] splitLine = line.split(", ");

		boolean has4G = false;
		if (splitLine[3].contains("TRUE")) {
			has4G = true;
		}
		int price = Integer.parseInt(splitLine[6]);
		double screenSize = Double.parseDouble(splitLine[1]);
		return new IPad(splitLine[0], price, splitLine[4], screenSize, splitLine[2], has4G, splitLine[5]);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String networkInformation = "having WiFi";
		if (has4G) {
			networkInformation += " and 4G";
		}
		networkInformation += " Technology\n";
		return "Apple iPad" + name.replace("IPAD", "") + " with " + memory + " of meomory\nwith an " + processor
				+ " processor and " + screensize + " inch screen\n" + networkInformation + price + "euro\n";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Product#fileFormated()
	 */
	@Override
	public String fileFormated() {
		String uses4G;
		if (has4G) {
			uses4G = "TRUE";
		} else {
			uses4G = "FALSe";
		}
		return name + ", " + screensize + ", " + processor + ", " + uses4G + ", " + color + ", " + memory + ", "
				+ price;
	}
}
