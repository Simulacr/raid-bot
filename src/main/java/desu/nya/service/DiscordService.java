package desu.nya.service;

import desu.nya.domain.BossRepository;
import desu.nya.domain.RaidRepository;
import desu.nya.domain.entity.RaidBossEntity;
import desu.nya.domain.entity.RaidEntry;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DiscordService {
    private final RaidRepository raidRepository;
    private final BossRepository bossRepository;

    public DiscordService(RaidRepository raidRepository, BossRepository bossRepository) {
        this.raidRepository = raidRepository;
        this.bossRepository = bossRepository;
    }

    public void register(Long id, Date killTime) {
        RaidBossEntity rb = bossRepository.findById(id).orElseThrow(RuntimeException::new);
        RaidEntry raidEntry = new RaidEntry();
        raidEntry.setRaidBoss(rb);
        raidEntry.setKillTime(new Date());
        raidRepository.save(raidEntry);
    }
}
