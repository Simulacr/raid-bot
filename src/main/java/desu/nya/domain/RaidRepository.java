package desu.nya.domain;

import desu.nya.domain.entity.RaidEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaidRepository extends JpaRepository<RaidEntry, Long> {
}
