package api.endpoints;
/*
 * Swagger URI---->https://petstore.swagger.io
 * 
 * Create User(post):https://petstore.swagger.io/v2/user
 * Get User(Get):https://petstore.swagger.io/v2/user/{username}
 * Update User(put):https://petstore.swagger.io/v2/user/{username}
 * Delete User(Delete):https://petstore.swagger.io/v2/user/{username}
 */

public class Routes {

	public static String  base_url ="https://petstore.swagger.io/v2";

	//User module

	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{username}";
	public static String put_url=base_url+"/user/{username}";
	public static String delete_url=base_url+"/user/{username}";

	//Store module

	//Here you will create Store module URL's
	// create user(post):https://petstore.swagger.io/v2/store/order
	//GetUser(get):https://petstore.swagger.io/v2/store/order/{orderId}
	//Update user(put):https://petstore.swagger.io/v2/store/order/{orderId}
	//deleteUser(delete):https://petstore.swagger.io/v2/store/order/{orderId}
	public static String store_post_url=base_url+"/store/order";
	public static String store_get_url=base_url+"/store/order/{orderId}";
	public static String store_put_url=base_url+"/store/order/{orderId}";
	public static String store_delete_url=base_url+"/store/order/{orderId}";




	//Pet module
	//Here you will create pet module URL's /pet/{petId}
	// create user(post):https://petstore.swagger.io/v2/pet
	//GetUser(get):https://petstore.swagger.io/v2/pet/{petId}
	//Update user(put):https://petstore.swagger.io/v2/pet/{petId} /pet/{petId}
	//deleteUser(delete):https://petstore.swagger.io/v2/pet/{petId}
	public static String pet_post_url=base_url+"/pet";
	public static String pet_get_url=base_url+"/pet/{petId}";
	public static String pet_put_url=base_url+"/pet";
	public static String pet_delete_url=base_url+"/pet/{petId}";
	
	




}
