package ms.email.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ms.email.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
