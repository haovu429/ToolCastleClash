package haovu.vn.castleclash.infrastructure.entiy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "gemstone")
public class Gemstone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
}
