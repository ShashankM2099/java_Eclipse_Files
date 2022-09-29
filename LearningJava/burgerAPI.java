package LearningJava;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class burgerAPI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		Request request = new Request.Builder()
				.url("https://fakerapi.it/api/v1/persons?_quantity=100&_locale=en_US&_gender=female")
				.method("GET", null).build();
		Response response = client.newCall(request).execute();
	}

}
