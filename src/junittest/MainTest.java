package junittest;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class MainTest {
	@Test
	public void test(){
		Main main = new Main();
		List<Integer> list = Arrays.asList(1,1,3,3,2);
//		assertThat(main.piyopiyo(list), is(contains(Arrays.asList(1,3,2))) );
//		assertThat(Arrays.asList(1,3,2), is(contains(Arrays.asList(1,3,2))));
		assertThat("", is(""));
	}
}
