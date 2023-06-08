import com.alibaba.nacos.api.utils.NetUtils;
import org.junit.Test;

import java.net.InetAddress;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class NetUtilsTest {

    @Test
    public void testLocalIP() {
        String localIp = NetUtils.localIP();
        assertNotNull(localIp);
        assertNotEquals(localIp, "resolve_failed");
        
        try {
            InetAddress localInetAddress = InetAddress.getByName(localIp);
            assertTrue(localInetAddress.isAnyLocalAddress() || localInetAddress.isLoopbackAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}