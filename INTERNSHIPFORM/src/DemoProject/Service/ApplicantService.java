package DemoProject.Service;

import DemoProject.model.Applicant;

public interface ApplicantService {
    void displayApplicantInfo(Applicant applicant);

    void admitted(Applicant applicant);
}
