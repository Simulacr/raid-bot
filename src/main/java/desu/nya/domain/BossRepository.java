package desu.nya.domain;

import desu.nya.domain.entity.RaidBossEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BossRepository extends JpaRepository<RaidBossEntity, Long> {
}
