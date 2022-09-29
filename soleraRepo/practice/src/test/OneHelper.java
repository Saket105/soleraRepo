package test;

public class OneHelper {
	private OneInterface.Animal animal;
	private OneInterface.Vechile vechile;
	
	private String name;
	private int speed;
	
	public OneHelper(){
		super();
		// TODO Auto-generated constructor stub
	}

	public OneInterface.Animal getAnimal() {
		return animal;
	}

	public void setAnimal(OneInterface.Animal animal) {
		this.animal = animal;
	}

	public OneInterface.Vechile getVechile() {
		return vechile;
	}

	public void setVechile(OneInterface.Vechile vechile) {
		this.vechile = vechile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "OneHelper [animal=" + animal + ", vechile=" + vechile + ", name=" + name + ", speed=" + speed + "]";
	}
	
	public void attachOne(OneInterface.Animal animalData) {
		this.animal = animalData;
		System.out.println("Animal "+this.name);
	}
	
	public void attachTwo(OneInterface.Vechile vehicleData) {
		this.vechile = vehicleData;
		System.out.println("vehicle "+this.name);
	}
	
	
}
