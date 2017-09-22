#parse("File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

@Test
public class ${NAME} {
    ${BODY}
}