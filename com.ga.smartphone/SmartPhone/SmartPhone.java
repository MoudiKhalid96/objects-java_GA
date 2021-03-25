package SmartPhone;

abstract class SmartPhone implements SmartPhones{

	private String company;
	private String OS;
	private String model;
	private String year;
	private String color;
	private String memorySize;
	private String cameraQuality;
	
	//Constructor
	public SmartPhone(String company, String OS, String model, String year, String color, String memorySize, String cameraQuality){
		this.company = company;
		this.OS = OS;
		this.model = model;
		this.year = year;
		this.color = color;
		this.memorySize = memorySize;
		this.cameraQuality = cameraQuality;
	}
	
	//Override Methods
	
	@Override
	public String getCompany() {
		return "The company is :" + this.company;
	}
	
	@Override
	public String getOS() {
		return this.model +" uses "+ this.OS + "as an OS";
	}
	
	@Override
	public String getModel() {
		return this.company + " has produced " + this.model;
	}
	
	@Override
	public String getYear() {
		
		return this.company + " has produced " + this.model + " in " + this.year;
	}
	
	@Override
	public String getColor() {
		return "Color of " + this.model + " is " + this.color;
	}
	
	@Override
	public String getMemorySize() {
		return "Memory size of " + this.model + " is " + this.memorySize;
	}
	
	@Override
	public String getCameraQuality() {
		return "Camera quality of " + this.model + " is " + this.cameraQuality;
	}
	
	//Common Methods
	public void fingerprint() {
		System.out.println("All smart phones can unlock using the fingerprint");
	}
	
	public void socialMedia() {
		System.out.println("All smart phones have social application");
	}
	
	public void printInfo() {
		System.out.println("This is the " + this.model + " from " + this.company + " that is workig on " + this.OS + " operating system, it has " + this.color + " color with " + this.memorySize + "GB, the quality of camera is up to " + this.cameraQuality + " pixels");
	}
}