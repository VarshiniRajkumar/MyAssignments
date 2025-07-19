package week4.day1;

public class APIClientHA {

	// two methods with same name

	public void sendRequest(String endpoint) {

		System.out.println("End point of ... " + endpoint);

	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("End point of ... " + endpoint);
		System.out.println("Request body of ..."+requestBody);
		if (requestStatus) {
			System.out.println("Request status accepted successfully");

		}
		if (!requestStatus) {
			System.out.println("Request staus failed in version 2.... Try again ");
		}	}

	public static void main(String[] args) {

		APIClientHA api = new APIClientHA();
		api.sendRequest("version 1");
		api.sendRequest("version 2", "version 2", true);
	}

}
