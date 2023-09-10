package haovu.vn.castleclash.infrastructure.entiy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "gemstone_recommend")
public class GemstoneRecommend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Gemstone gemstone;
	@ManyToOne
	private Hero hero;
	private int rateCount;
}
