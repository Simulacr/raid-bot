package desu.nya.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name = "RAID_ENTRY")
@Entity
@Data
public class RaidEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private RaidBossEntity raidBoss;
    @Column
    private Date killTime;
}
