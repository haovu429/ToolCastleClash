package haovu.vn.castleclash.infrastructure.model;

import haovu.vn.castleclash.infrastructure.entiy.*;
import lombok.Data;

import java.util.List;

@Data
public class HeroComboRecommend {
	private Hero hero;
	private List<SkillRecommend> skillRecommends;
	private List<GemstoneRecommend> gemstoneRecommends;
	private List<SoulRecommend> soulRecommends;
}
