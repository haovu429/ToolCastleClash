package haovu.vn.castleclash.infrastructure.entiy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hero")
public class Hero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
}
