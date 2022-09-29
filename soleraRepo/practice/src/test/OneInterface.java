package test;

public interface OneInterface {
	interface Animal{
		void runSuccess();
		void runFailure(Exception e);
	}
	
	interface Vechile{
		void driveSuccess();
		void driveFailure(Exception e);
	}
}
