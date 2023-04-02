package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Store;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StoreEndPoints {
	
	public static Response CreateUser(Store payload) {
		
		Response response=given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
			.when()
			.post(Routes.store_post_url);
			
			return response;
			
			
		}
		
		public static Response GetUser(int id) {
			
			Response response=given()
					.pathParam("orderId", id)
					.when()
					.get(Routes.store_get_url);
			return response;
		}
		
		public static Response UpdateUser(int id,Store payload) {
			Response response=given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(payload)
					.pathParam("orderId", id)
					.when()
					.put(Routes.store_put_url);
					
					return response;
		}
	public static Response DeleteUser(int id) {
			
			Response response=given()
					.pathParam("orderId" ,id)
					.when()
					.delete(Routes.store_delete_url);
			return response;
		}


}
