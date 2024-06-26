package test;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.BaseTest.*;

public class  UploadImageTest {
    @Test @org.testng.annotations.Test
    public void successUploadImageTest() {
        String accessAdminToken = getAdminAccessToken();

        File imageFile = new File("/Users/annganzha/Desktop/foto/cat.jpeg");

        Response uploadImageResponse = postRequestWithImage(POST_IMAGE_PATH, 200, imageFile, accessAdminToken);

        assertEquals(200, uploadImageResponse.getStatusCode(), "Upload image request should return status code 200");
    }
}
