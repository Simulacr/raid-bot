package desu.nya.domain.entity;

import javax.persistence.*;
import java.util.Set;

@Table(name = "RAID_BOSS")
@Entity
public class RaidBossEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column(name = "en_name")
    private String enName;
    @Column(name = "ru_name")
    private String ruName;
    @Column(name = "cooldown")
    private Long coolDown;
    @Column(name = "probability")
    private Integer probability;
    @OneToMany
    private Set<RaidEntry> raids;
}
