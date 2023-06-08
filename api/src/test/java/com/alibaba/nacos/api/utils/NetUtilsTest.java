import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.alibaba.nacos.api.utils.NetUtils;

class NetUtilsTest {

    @Test
    void testLocalIP() {
        String localIP = NetUtils.localIP();
        assertNotEquals("127.0.0.1", localIP);
        assertNotEquals("0:0:0:0:0:0:0:1", localIP);
        assertNotEquals("resolve_failed", localIP);
    }
}

