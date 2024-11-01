package ms.email.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {
	
//	referencia do usuário
	@NotBlank
	private String ownerRef;
//	de quem ta mandando o email
	@NotBlank
	@Email
	private String emailFrom;
//	de quem ta recebendo o email
	@NotBlank
	@Email
	private String emailTo;
//	O titulo do email
	@NotBlank
	private String subject;
	@NotBlank
	private String text;
}
