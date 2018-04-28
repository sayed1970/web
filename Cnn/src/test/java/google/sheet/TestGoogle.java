package google.sheet;

import Google.sheet.page;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class TestGoogle extends page {
    @Test
    public void testGooglesheet() throws IOException, GeneralSecurityException {
        page p = new page();
        p.readGooglesheet ();
    }
}
