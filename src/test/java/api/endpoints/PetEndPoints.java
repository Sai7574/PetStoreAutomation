package api.endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import api.payload.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEndPoints {
	
	
	public static Response CreateUser(Pet payload) {
		
	Response response=given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.pet_post_url);
		
		return response;
		
		
	}
	
	public static Response GetUser(int Id) {
		
		Response response=given()
				.pathParam("petId", Id)
				.when()
				.get(Routes.pet_get_url);
		return response;
	}
	
	public static Response UpdateUser(Pet payload) {
		Response response=given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.put(Routes.pet_put_url);
				
				return response;
	}
public static Response DeleteUser(int Id) {
		
		Response response=given()
				.pathParam("petId", Id)
				.when()
				.delete(Routes.pet_delete_url);
		return response;
	}

}
