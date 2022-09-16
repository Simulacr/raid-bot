package desu.nya.notificator;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DiscordNotificator {
    private String url;
    private RestTemplate discordRestTemplate;

    public void showRegistration() {
    }
}
