package haovu.vn.castleclash.infrastructure.entiy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "skill_recommend")
public class SkillRecommend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int skillId;
	private int heroId;
	private int rateCount;
}
