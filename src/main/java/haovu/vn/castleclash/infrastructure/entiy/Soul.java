package haovu.vn.castleclash.infrastructure.entiy;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "soul")
public class Soul {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
}
