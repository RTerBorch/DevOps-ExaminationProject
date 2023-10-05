package com.example.DevOpsExaminationProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

@SpringBootTest
class DevOpsExaminationProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	//Test that the main method runs without issues (no exceptions thrown) - usable for jacoco
	@Test
	void mainRunsWithoutIssues() {
		assertThatCode(() ->
				DevOpsExaminationProjectApplication.main(new String[] {})
		).doesNotThrowAnyException();
	}

}
