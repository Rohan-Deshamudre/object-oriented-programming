
/**
 * A concrete class for iPhones
 * 
 * @author ricar
 *
 */
public class IPhone extends Product {
	private double screensize;
	private String processor;
	private boolean isGSM;
	private String memory;
	private boolean has3DTouch;

	/**
	 * Constructor for the class IPhone
	 * 
	 * @param name
	 * @param price
	 * @param color
	 * @param screensize
	 * @param processor
	 * @param isGSM
	 * @param memoryType
	 * @param has3dTouch
	 */
	public IPhone(String name, int price, String color, double screensize, String processor, boolean isGSM,
			String memory, boolean has3dTouch) {
		super(name, price, color);
		this.screensize = screensize;
		this.processor = processor;
		this.isGSM = isGSM;
		this.memory = memory;
		has3DTouch = has3dTouch;
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
	 * @return the isGSM
	 */
	public boolean isGSM() {
		return isGSM;
	}

	/**
	 * @param isGSM the isGSM to set
	 */
	public void setGSM(boolean isGSM) {
		this.isGSM = isGSM;
	}

	/**
	 * @return the memory
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * @param memoryType the memoryType to set
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}

	/**
	 * @return the has3DTouch
	 */
	public boolean isHas3DTouch() {
		return has3DTouch;
	}

	/**
	 * @param has3dTouch the has3DTouch to set
	 */
	public void setHas3DTouch(boolean has3dTouch) {
		has3DTouch = has3dTouch;
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
		if (!(obj instanceof IPhone)) {
			return false;
		}
		IPhone other = (IPhone) obj;
		if (has3DTouch != other.has3DTouch) {
			return false;
		}
		if (isGSM != other.isGSM) {
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
	 * Reads in a line, for example from a text file, and returns an iPhone
	 * 
	 * @param line line to read from
	 * @return an iPhone
	 */
	public static IPhone read(String line) {
		String[] splitLine = line.split(", ");
		boolean isGSM = false;
		if (splitLine[3].contains("GSM")) {
			isGSM = true;
		}
		boolean has3D = false;
		if (splitLine[5].contains("TRUE")) {
			has3D = true;
		}
		int price = Integer.parseInt(splitLine[7]);
		double screenSize = Double.parseDouble(splitLine[1]);
		return new IPhone(splitLine[0], price, splitLine[4], screenSize, splitLine[2], isGSM, splitLine[5], has3D);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Apple iPhone" + name.replace("IPHONE", "") + " with " + memory + " of meomory\nwith an " + processor
				+ " processor and " + screensize + " inch screen\n" + price + "euro\n";
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see Product#fileFormated()
	 */
	@Override
	public String fileFormated() {
		String modem;
		if (isGSM) {
			modem = "GSM";
		} else {
			modem = "CDMA";
		}
		String has3D;
		if (has3DTouch) {
			has3D = "TRUE";
		} else {
			has3D = "FALSE";
		}
		return name + ", " + screensize + ", " + processor + ", " + modem + ", " + color + ", " + has3D + ", " + price;
	}

}
